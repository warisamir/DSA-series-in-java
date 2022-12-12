class Solution {
    public int climbStairs(int n) {
      int dp[]=new int[n+1];
        return climbStairs(dp,n);
    }
    private int climbStairs(int dp[],int n){
        if(n==1)return 1;
        if(n==2)return 2;
        if(dp[n]>0)return dp[n];
        return dp[n]=climbStairs(dp,n-1)+climbStairs(dp,n-2);
    }
}