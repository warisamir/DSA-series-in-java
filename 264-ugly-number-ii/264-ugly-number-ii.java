class Solution {
   public int nthUglyNumber(int n) {
       int dp[]=new int[n+1];
       dp[0]=1;
       int p=0,q=0,r=0;
       for(int i=1;i<n;i++){
           int sm2=dp[p]*2;
           int sm3=dp[q]*3;
           int sm5=dp[r]*5;
           dp[i]=Math.min(Math.min(sm2,sm3),sm5);
           if(dp[i]==sm2)p++;
           if(dp[i]==sm3)q++;
           if(dp[i]==sm5)r++;
       }
       return dp[n-1];
   }
}