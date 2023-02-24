class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
      for(int j=0;j<9;j++){
          if(board[i][j]!='.' && isvalid(board,i,j,board[i][j]))
          {
           return false;   
          }
        }}
        return true;
    }
    public boolean isvalid(char board[][],int x,int y,char ch){
        for(int j=0;j<board[x].length;j++){
            if(j!=y){
                if(board[x][j]==ch)
                { System.out.println(board[x][j]);
                  System.out.println(ch);
                    return true;}
            }
        }
        for(int i=0;i<board.length;i++){
            if(i!=x){
                if(board[i][y]==ch)
                {     System.out.println(board[i][y]);
                 System.out.println(ch);
                    return true;
                }
            }
        }
        int nx=(x/3)*3,ny=(y/3)*3;
        for(int i=nx;i<nx+3;i++){
        for(int j=ny;j<ny+3;j++){
            if(i==x && j==y)
            {
                    System.out.println(board[i][j]);
              
                continue;
            }
            else {
                if(board[i][j]==ch)
                    return true;
        }
        }
        }
        return false;
    }
}