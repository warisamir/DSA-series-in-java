class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int dp[][]=new int[n][target+1];
        for(int i[]:dp)
        Arrays.fill(i,-1);
        return res(0,n,k,dp,target);
    }
    static int mod=1_000_000_007;
    public static int res(int id,int n,int k,int [][]dp,int t){
        if(id==n)
        {
            if(t==0)
                return 1; 
            return 0;
        }
       
        if(t<0) return 0;
       if(t==0 &&id<n) return 0;
        if(dp[id][t]!=-1)return dp[id][t];
        int ct=0;
        for(int i=1;i<=k;i++){
            ct+=res(id+1,n,k,dp,t-i);
            ct%=mod;
        }
        dp[id][t]=ct;
        return ct;
    }
}