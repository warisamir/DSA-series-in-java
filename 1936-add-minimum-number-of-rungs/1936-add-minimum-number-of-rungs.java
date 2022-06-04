class Solution {
    public int addRungs(int[] rungs, int dist) {
         int ci=0;
    int res = 0;
    for(int i =0; i < rungs.length;i++) {
        int cr = rungs[i];
        int rem = cr-ci;
        if(rem-dist>0) {
            res = res+((rem-1) / dist);
        }
        ci = rungs[i];
    }
    return res;
}
}