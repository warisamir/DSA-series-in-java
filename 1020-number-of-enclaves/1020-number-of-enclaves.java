class Solution {
   public int ct=0;
    public int numEnclaves(int[][] grid) {
        int ans=0;
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                { ct=0;
                 if(dfs(i,j,grid))
                ans+=ct;
            }
            }
         }
        return ans;
    }
        
          public boolean dfs(int r,int c,int [][]grid){
        if(r<0 || c<0|| r>=grid.length || c>=grid[0].length)
            return false;
               if(grid[r][c]==0)
                   return true;
              grid[r][c]=0;
              ct++;
      boolean A = dfs(r, c+1, grid);
        boolean B = dfs(r, c-1, grid);
        boolean C = dfs(r+1, c, grid);
        boolean D = dfs(r-1, c, grid);
        
        return A && B && C && D;  }
}