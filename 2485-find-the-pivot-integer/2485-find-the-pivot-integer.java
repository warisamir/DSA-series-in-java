class Solution {
    public int pivotInteger(int n) {
        int a=n*(n+1)/2;
        for(int i=1;i<=n;i++){
           if(i*i==a)
                return i;
        }
        return -1;
        
    }
}