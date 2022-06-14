class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int n=t1.length();
        int m=t2.length();
        int dp[]=new int [m+1];
        for(int i=1;i<n+1;i++){
            int tl[]=new int[m+1];
            for(int j=1;j<m+1;j++){
                if(t1.charAt(i-1)==t2.charAt(j-1))
                tl[j]=1+dp[j-1];
                else 
                  tl[j]=Math.max(dp[j],tl[j-1]);
                
            }dp=tl;
        }
        return dp[t2.length()];
    }
}