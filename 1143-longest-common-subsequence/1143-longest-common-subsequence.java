class Solution {
    public int longestCommonSubsequence(String t, String t1) {
       int m = t.length();
        int n = t1.length();
        int max =0 ;
        int[][] dp = new int[m+1][n+1];
    
        for(int i=1;i<m+1;i++){
          for(int j=1;j<n+1;j++){
            if(t.charAt(i-1)==t1.charAt(j-1)){
              dp[i][j] = dp[i-1][j-1]+1;
            }
            else{
              dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
            max = Math.max(dp[i][j], max);
          }
        }
      
        return max;
    }
}