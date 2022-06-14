class Solution {
    public int minDistance(String word1, String word2) {
        int len=word1.length();
        int l2=word2.length();
        int dp[]=new int[l2+1];
        for(int i=1;i<len+1;i++){
            int temp[]=new int[l2+1];
            for(int j=1;j<l2+1;j++)
            {
                if(word1.charAt(i-1)==word2.charAt(j-1))
                    temp[j]=1+dp[j-1];
                else
                    temp[j]=Math.max(dp[j],temp[j-1]);
                
            }
            dp=temp;
        }
        return len+l2-(2*dp[l2]);
    }
}