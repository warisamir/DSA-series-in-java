class Pair{
    int row,col, dist;
    Pair(int row,int col ,int dist){
        this.row=row;
        this.col=col;
        this.dist=dist;
    }
}
class Solution {
    int [][]colls={{-1,0},{1,0},{0,-1},{0,1}};
    public int orangesRotting(int[][] grid) {
     Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2)
        q.add(new Pair(i,j,0));
            }
        }
        int min=0;//min time to rotten the oranfges
        while(q.size()>0){
            Pair fr=q.remove();
            if(grid[fr.row][fr.col]==3)//already visited 
                continue;
            grid[fr.row][fr.col]=3;//visited && marked
            min=Math.max(fr.dist,min);
          for(int i=0;i<4;i++){
              int nr=fr.row+colls[i][0];
              int nc=fr.col+colls[i][1];
              //empty cell or already rotten 
              if(nr<0 ||nc<0 ||nr>=grid.length ||nc>=grid[0].length)continue;
              if(grid[nr][nc]==0 || grid[nr][nc]==3)
                  continue;
              q.add(new Pair(nr,nc,fr.dist+1));
          }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
               // System.out.print(grid[i][j]);
                if(grid[i][j]==1)
                    return -1;//not possible to rotten the oranges
            }
        }
        return min;
    }
}