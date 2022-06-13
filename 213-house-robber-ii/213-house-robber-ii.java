class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
      
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        else if(nums.length==2) return Math.max(nums[1],nums[0]);
            return Math.max(dpmeth(nums,0,n-2),dpmeth(nums,1,n-1));
        
        
    }
  public  int dpmeth(int []nums,int s,int t){
      int dp[]=new int[nums.length+2];
      for(int i=t;i>=s;i--){
          dp[i]=Math.max(dp[i+1],(dp[i+2]+nums[i]));
      }
      return dp[s];
    }
}