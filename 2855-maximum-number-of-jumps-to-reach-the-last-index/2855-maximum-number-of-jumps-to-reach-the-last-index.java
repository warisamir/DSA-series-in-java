class Solution {
    Integer []dp;
    public int maximumJumps(int[] nums, int target) {
         int index =0;
        dp = new Integer[nums.length +1];
        return  solve(index, nums, target, nums.length);
    }
    private int solve(int index, int[] nums, int target, int n) {
        
        if(index == n-1) {
            return 0;
        }
        if(dp[index] != null ) {
            return dp[index];
        }
        int ans =-1;
        
        for(int i = index +1; i< n; i++) {
            if(Math.abs(nums[i] - nums[index]) <= target){
                int currAns = solve(i, nums, target, n);
                if(currAns != -1) {
                    ans = Math.max(ans, 1 + currAns);
                }
            }
        }
        return dp[index] =ans;
    }
}