class Solution {
    public int countPrimeSetBits(int l, int r) {
        int ct=0;
        for(int i=l;i<=r;i++){
           int b=Integer.bitCount(i);
            if(isprime(b))
                ct++;
            }
        return ct;
    }
    public boolean isprime(int n){
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
        }
}