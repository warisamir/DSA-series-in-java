class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        int curr=0;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               curr=Math.max(curr,lcp(dp,i,j,matrix,-1));
                
            }
        }
        return curr;
    }
    public int lcp(int dp[][],int i,int j,int mat[][],int val){
        if(i<0 || j<0 || i==mat.length || j==mat[0].length || mat[i][j]<=val)return 0;
        if(dp[i][j]>0)
            return dp[i][j];
        return dp[i][j]=Math.max(Math.max(lcp(dp,i+1,j,mat,mat[i][j]),lcp(dp,i,j+1,mat,mat[i][j])),Math.max(lcp(dp,i-1,j,mat,mat[i][j]),lcp(dp,i,j-1,mat,mat[i][j])))+1;
    }
}