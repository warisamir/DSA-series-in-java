class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]);
                else
                {
                 res+=(nums[i-1]+1-nums[i]);
                    nums[i]=nums[i-1]+1;
                }
        }
        return res;
    }
}