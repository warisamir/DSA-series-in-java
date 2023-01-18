class Solution {
    public int maxSubArray(int[] nums) {
        int mx=0,currmx=nums[0];
        for(int k:nums){
            mx=Math.max(mx+k,k);
            currmx=Math.max(currmx,mx);
        }
        return currmx;
    }
}