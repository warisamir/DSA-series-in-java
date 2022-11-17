class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
         int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=dp.length-2;i>=0;i--){
            for(int j=dp[0].length-2;j>=0;j--){
                if(text1.charAt(i)==text2.charAt(j))
                    dp[i][j]=dp[i+1][j+1]+1;
                else
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
            }
            
        }
        return dp[0][0];
    }
}

