class Solution {
    public int titleToNumber(String s) {
    int res=0;
        for(char ch:s.toCharArray()){
            res*=26;
            res+=ch-'A'+1;
        }
        return res;
    }
}