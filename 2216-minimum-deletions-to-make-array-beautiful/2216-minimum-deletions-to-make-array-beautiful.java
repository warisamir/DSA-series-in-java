class Solution {
    public int minDeletion(int[] nums) {
       int count=0;
        int n=nums.length;
        for(int i=0;i<nums.length-1;i++){
           if((i-count)%2==0 && nums[i]==nums[i+1])
               count++;
        }
        if((n-count)%2==1)
        {
            return count+1;
        }
        return count;
    }
}