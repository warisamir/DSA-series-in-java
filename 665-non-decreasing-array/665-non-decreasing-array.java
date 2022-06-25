class Solution {
    public boolean checkPossibility(int[] nums) {
       for(int i=1,j=0;i<nums.length;i++){
           if(nums[i]<nums[i-1]){
           if(j>0 ||(i<nums.length-1 && i>1 && nums[i-2]>nums[i] && nums[i+1]<nums[i-1]))
             return false ;
           j++;
       }
       }
        return true;
    }
}