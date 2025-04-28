class Solution {
    public long countSubarrays(int[] nums, long k) {
        long sm=0,ct=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            sm+=nums[r];
            while(sm*(r-l+1)>=k){
                sm-=nums[l++];
            }
            ct+=(r-l+1);
        }
        return ct;
    }
}