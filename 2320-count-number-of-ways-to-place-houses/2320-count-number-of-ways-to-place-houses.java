class Solution {
    public int countHousePlacements(int n) {
     int mod=1_000_000_007;
        long zero=1;
        long one=1;
        for(int i=2;i<=n;i++){
            long nzero=one;
            long none=(one+zero)%mod;
           one=none;
            zero=nzero;
       }
        long t=(one+zero)%mod;
        long ans=(t*t)%mod;
        return (int)ans;
    }
}