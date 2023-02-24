class Solution {
    public void solveSudoku(char[][] board) {
        solveSudoku(board,0,0);
    }
    public boolean isvalid(char [][]board,int x,int y,char ch){
   for(int i=0;i<board[x].length;i++){
       if(board[i][y]==ch)
           return false;
            if(board[x][i]==ch)
                return false;
        }
       
        int nx=3*(x/3),ny=3*(y/3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            {
                if(board[nx+i][ny+j]==ch)
                    return false;
            }
        }
        return true;
    }
   
    public boolean solveSudoku(char[][] arr,int x,int y) {
        if(x==arr.length)
            return true;
     int nx=0;
        int ny=0;
        if(y==arr.length-1)
        {
            nx=x+1;
            ny=0;
        }
        else{
            nx=x;
            ny=y+1;
        }
         if(arr[x][y]!='.')
        {
           if(solveSudoku(arr,nx,ny))
            return true;
        }
        else{
        for(char p='1';p<='9';p++){
            if(isvalid(arr,x,y,p)==true)
            {  
                arr[x][y]=p;
           if(solveSudoku(arr,nx,ny))
            return true;
              else
              arr[x][y]='.';
        }
        }
              }
        return false;
              }
              }
              