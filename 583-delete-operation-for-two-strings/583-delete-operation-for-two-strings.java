class Solution {
    public int minDistance(String word1, String word2) {
        int len=word1.length();
        int l2=word2.length();
        int dp[][]=new int[len+1][l2+1];
        for(int i=1;i<len+1;i++){
            for(int j=1;j<l2+1;j++)
            {
                if(word1.charAt(i-1)==word2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                
            }
        }
        return len+l2-(2*dp[len][l2]);
    }
}