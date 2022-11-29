class Solution {
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        if((n^1)==(n+1))
            return n/2;
        else return n;
    }
}