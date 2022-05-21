class Solution {
    public int removeDuplicates(int[] nums) {
    int point=2;
      if(nums.length<=2)
          return nums.length;
           for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[point-2]){
                nums[point++]=nums[i];
            }
        }
        return point;
    }
}