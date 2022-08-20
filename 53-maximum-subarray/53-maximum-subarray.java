class Solution {
    public int maxSubArray(int[] nums) {
        int min=Integer.MIN_VALUE;
        int sm=0;
       for(int i:nums){
        if(sm<0)sm=i;
           else sm+=i;
        min=Math.max(min,sm);
       }
        return min;
    }
}