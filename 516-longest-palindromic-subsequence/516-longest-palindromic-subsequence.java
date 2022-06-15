class Solution {
   public int longestPalindromeSubseq(String s) {
        int m = s.length();
        StringBuilder sb = new StringBuilder();
        while(m > 0){
            sb.append(s.charAt(m-1));
            m--;
        }
        String s2 = sb.toString();
        return lcs(s, s2);
    }
    public int lcs(String s1, String s2){
        int m = s1.length(), n = s2.length();
        int dp[][] = new int[m+1][n+1];
        for(int i = 0; i< m+1; i++){
            for(int j = 0; j < n+1; j++){
                if(i == 0 || j == 0)
                    dp[i][j] = 0;
                else if( s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}
