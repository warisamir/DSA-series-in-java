class Solution {
    public int hammingDistance(int x, int y) {
       int k=x^y,ct=0;
        while(k!=0){
            int rsb=k&-k;
            k=k-rsb;
            ct++;
        }
        return ct;
    }
}