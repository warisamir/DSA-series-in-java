class Solution {
    public int numberOfWays(String s) {
       int x=1;
        int y=0;
        int z=0;
        int mod=1_000_000_007;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='S')
            {
                x=(x+z)%mod;
                z=y;
                y=x;
                x=0;
            }
            else
                 x=(x+z)%mod;
        }
        return z;
    }
}