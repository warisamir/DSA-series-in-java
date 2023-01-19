public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
     int ans=0;
        while(n!=0){
        int rsb=n&(-n);
            n=n-rsb;
            ans++;
        }
        return ans;///Integer.bitCount(n);
    }
}