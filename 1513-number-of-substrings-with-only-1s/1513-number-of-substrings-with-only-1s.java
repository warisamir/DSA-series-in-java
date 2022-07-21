class Solution {
    public int numSub(String s) {
        int m=1_000_000_007;
        int c=0;
        int res=0;
        for(int i=0;i<s.length();i++){
         c=(s.charAt(i)=='1')?c+1:0;
            res=(res+c)%m;
        }
        return res;
    }
}