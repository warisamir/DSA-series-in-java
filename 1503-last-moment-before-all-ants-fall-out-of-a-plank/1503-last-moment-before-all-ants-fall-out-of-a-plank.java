class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int t=0;
        for(int a:left)t=Math.max(a,t);
        for(int a:right)t=Math.max(t,n-a);
        return t;
    }
}