class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        int n=nums.length;
        for(int i:nums){
            sum+=i;
        }
        int t=sum/k;
        if(k>n || sum%k!=0)
            return false;
        if(k==1) return true;
        boolean visited[]=new boolean[n];
    return  dfs(nums,0,k,t,t,visited);
    }
    private boolean dfs(int[] nums, int s, int k, int target, int subsetTargetSum, boolean[] seen) {
    if (k == 0)
      return true;
    if (target < 0)
      return false;
    if (target == 0)
      return dfs(nums, 0, k - 1, subsetTargetSum, subsetTargetSum, seen);

    for (int i = s; i < nums.length; ++i) {
      if (seen[i])
        continue;
      seen[i] = true;
      if (dfs(nums, i + 1, k, target - nums[i], subsetTargetSum, seen))
        return true;
      seen[i] = false;
    }

    return false;
  }
}