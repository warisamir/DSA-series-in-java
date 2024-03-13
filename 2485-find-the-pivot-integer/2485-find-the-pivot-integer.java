class Solution {
    public int pivotInteger(int n) {
        int sm=n*(n+1)/2;
        for(int i=1;i<=n;i++){
            if(i*i==sm)
                return i;
        }
        return -1;
    }
}