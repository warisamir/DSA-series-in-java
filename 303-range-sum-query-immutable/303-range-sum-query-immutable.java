class NumArray {
  int dp[];
    public NumArray(int[] nums) {
        int n=nums.length;
        dp=new int[n];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=dp[i-1]+nums[i];
        }
    }
    
    public int sumRange(int l, int r) {
        if(l==0) return dp[r];
        else 
            return dp[r]-dp[l-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */