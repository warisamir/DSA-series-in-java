class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];

        if(nums.length==1)
            return nums[0];
        else if(nums.length==2)
            return Math.max(nums[0],nums[1]);
        int ans=Math.max(nums[0],nums[1]);
        int maxl=nums[0];
        for(int i=2;i<nums.length;i++){
            maxl=Math.max(nums[i-2],maxl);
            nums[i]=nums[i]+maxl;
            ans=Math.max(ans,nums[i]);
        }
        return ans;
    }
}