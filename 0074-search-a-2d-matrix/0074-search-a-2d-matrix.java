class Solution {
    public boolean searchMatrix(int[][] mt, int tar) {
       int r=mt.length;
        int c=mt[0].length;
        int hi=r*c-1;
        int lo=0;
        int mid=lo+((hi-lo)>>1);
        while(lo<=hi){
            int e=mt[mid/c][mid%c];
            if(e==tar)
                return true;
            else if(e<tar){
                lo=mid+1;
            }
            else 
                hi=mid-1;
            mid=lo+((hi-lo)>>1);
        }
        return false;
    }
}