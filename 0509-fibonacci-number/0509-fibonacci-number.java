class Solution {
    public int fib(int n) {
        int []memo=new int[n+1];
        Arrays.fill(memo,-1);
       return  memoize(n,memo);
       
    }
    // public int fibtab(int n){
    //     int dp[]=new int[n+1];
    //     dp[0]=0; dp[1]=1;
    //     for(int i=2;i<=n;i++){
    //         dp[i]=dp[i-1]+dp[i-2];
    //     }
    //     int k=dp[n];
    //     return k;
    // }
    public int memoize(int n,int []memo){
        if(n==0 || n==1) 
                       return n;   
        if(memo[n]!=-1) return memo[n];
        int fib1=memoize(n-1,memo);
        int fib2=memoize(n-2,memo);
       memo[n]=fib1+fib2;
        return memo[n];
    }   
}