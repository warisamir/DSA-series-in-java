class Solution {
    public int change(int t, int[] coins) {
        int[] dp=new int[t+1];
        dp[0]=1;
        for(int coin:coins)
            
            for(int i=0;i<=t-coin;++i)
                
                dp[i+coin]+=dp[i];
        
        return dp[t];
    }
}