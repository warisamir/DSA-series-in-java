class Solution {
    public boolean canPartition(int[] nums) {
        int s=0;
        for(int i:nums)
            s+=i;
        if(s%2!=0)
            return false;
       s=s/2;
        
        boolean dp[]=new boolean[s+1];
        dp[0]=true;
            for(int i=0;i<nums.length;i++){
                boolean ndp[]=new boolean[s+1];
                ndp[0]=true;
                for(int j=1;j<s+1;j++){
                  if(j>=nums[i] && dp[j-nums[i]])
                    ndp[j]=true;
                    else
                        ndp[j]=dp[j];
                }
               if(ndp[s])return true;
                dp=ndp;
            }
        return false;
    }
}