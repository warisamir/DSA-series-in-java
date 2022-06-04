class NumMatrix {
    private int dp[][];
    public NumMatrix(int[][] mat) {
        if(mat.length==0|| mat[0].length==0 || mat==null)
            return;
        int n=mat.length;
        int m=mat[0].length;
        dp=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++)
                dp[i][j]=dp[i][j-1]+dp[i-1][j]-dp[i-1][j-1] +mat[i-1][j-1];
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2+1][col2+1]-dp[row2+1][col1]-dp[row1][col2+1]+dp[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */