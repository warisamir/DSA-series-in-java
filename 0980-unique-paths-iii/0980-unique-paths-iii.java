class Solution {
    public int uniquePathsIII(int[][] grid) {
        int sr=0,sc=0;
        int ct=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
               if(grid[i][j]==0) ct++;
                else if(grid[i][j]==1){
                    sr=i;sc=j;
                    
                }
            }
        }
        return dfs(grid,sr,sc,ct);
    }
    private int dfs(int [][]grid,int r,int c,int ct){
        if(r<0 || c<0|| r>=grid.length || c>=grid[0].length|| grid[r][c]==-1)
            return 0;
        if(grid[r][c]==2)
            return ct==-1?1:0;
       grid[r][c]=-1;
        ct--;
        int pst=dfs(grid,r+1,c,ct)+dfs(grid,r,c+1,ct)+dfs(grid,r-1,c,ct)+dfs(grid,r,c-1,ct);
        grid[r][c]=0;
        ct++;
        return pst;
    }
}