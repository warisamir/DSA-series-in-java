class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int sum=0,result=Integer.MAX_VALUE,left=0;
       for(int i=0;i<nums.length;i++ ){
            sum+= nums[i];
            while(sum>= target){
                result = Math.min(result, i-left+1);
                sum-=nums[left++];
            }}
           return result!=Integer.MAX_VALUE?result:0;
    }
        
}