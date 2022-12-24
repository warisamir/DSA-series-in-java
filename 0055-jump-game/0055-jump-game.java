class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length-1;
        for(int i=n;i>=0;i--){
            if(i+nums[i]>=n)
                n=i;
        } 
        return n==0;
    }
}