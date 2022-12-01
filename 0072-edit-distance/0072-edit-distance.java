class Solution {
    public int minDistance(String s, String t) {
        int dp[][]=new int[s.length()+1][t.length()+1];
        for(int i=0;i<=s.length();i++){
            for(int j=0;j<=t.length();j++){
              if(j==0)
              dp[i][j]=i;
              else if(i==0)
              dp[i][j]=j;
              else{
                  if(s.charAt(i-1)==t.charAt(j-1)){
                      dp[i][j]=dp[i-1][j-1];
                  }
                  else{
                      dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]))+1;
                  }
              }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}