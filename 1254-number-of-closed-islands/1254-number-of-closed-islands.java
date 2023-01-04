class Solution {
    int dir[][]=new int [][]{{1,0},{0,1},{0,-1},{-1,0}};
    public int closedIsland(int[][] grid) {
        int ct=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0)
                    if(dfs(grid,i,j)) ct++;
            }}
            return ct;
        }
    
    public boolean dfs(int grid[][],int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length)
            return false;
        if(grid[i][j]==1)
            return true;
        grid[i][j]=1;
        boolean res=true;
                for(int[] d : dir){
            res = res & dfs(grid, i + d[0], j + d[1]);
        }
        
        return res;
    }
}