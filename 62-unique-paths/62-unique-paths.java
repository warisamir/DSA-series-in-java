class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) dp[i][j]=1;
               
                else{
                     int r=0,col=0;
                    if(i>0) r=dp[i-1][j];
                    if(j>0) col=dp[i][j-1];
                 dp[i][j]=r+col;   
                }
            }
        }
        return dp[m-1][n-1];
    }
}