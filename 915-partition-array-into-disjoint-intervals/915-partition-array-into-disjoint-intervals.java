class Solution {
    public int partitionDisjoint(int[] nums){
        int mtp=nums[0];
        int mts=nums[0];
        int pi=0;
        for(int i=0;i<nums.length;i++){
            mts=Math.max(mts,nums[i]);
            if(nums[i]<mtp){
                pi=i;
                mtp=mts;
            }
        }
        return pi+1;
    }
}