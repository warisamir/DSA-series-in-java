class Solution {
    public int concatenatedBinary(int n) {
        int s=0;
       long res=0;
        long mi=1_000_000_007;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0) s++;
            res=(res<<s|i)%mi;
        }return (int)res;
    }
}