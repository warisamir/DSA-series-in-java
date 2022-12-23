class Solution {
   
    public int numIslands(char[][] grid) {
        int ice=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1')
                { dfs(i,j,grid);
                ice++;
            }
            }
        }
        return ice;
    }
    public void dfs(int r,int c,char [][]grid){
        if(r<0 || c<0|| r>=grid.length || c>=grid[0].length)
            return;
        if(grid[r][c]=='0' || grid[r][c]=='N')
            return ;
        grid[r][c]='N';
        dfs(r+1,c,grid);
     dfs(r,c+1,grid); 
        dfs(r-1,c,grid); 
        dfs(r,c-1,grid);
    }
}