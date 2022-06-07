class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;++i)
            for(int j=0;j<grid[0].length;++j)
                ans=Math.max(fun(grid,i,j),ans);
            
        return ans;
    }
    private int fun(int arr[][],int i,int j){
        if(i<0 || i==arr.length|| j<0 || j==arr[0].length)
            return 0;
        if(arr[i][j]!=1)
            return 0;
        arr[i][j]=2;
        return 1+ fun(arr,i+1,j)+ fun(arr,i-1,j)+fun(arr,i,j+1)+fun(arr,i,j-1);
    }
}