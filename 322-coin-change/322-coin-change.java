class Solution {
    public int coinChange(int[] coins, int t) {
        int n=coins.length;
        int sm=0;
        int max=t+1;
         int dp[]=new int [t+1];
        Arrays.fill(dp,max);
        dp[0]=0;
        for(int currt=1;currt<=t;currt++){
            for(int j=0;j<coins.length;j++){
               if(coins[j]<=currt){
                   
                   dp[currt]=Math.min(dp[currt],1+dp[currt-coins[j]]);
               }
                  
        }
        }
        return dp[t]>t?-1:dp[t];
        }}