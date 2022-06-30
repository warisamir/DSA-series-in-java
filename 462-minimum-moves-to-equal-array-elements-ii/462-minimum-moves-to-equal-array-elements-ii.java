class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
           
       int i=0,j=nums.length;
        int mid=nums[(j)/2];
       int r=0;
       while(i<j){
           r+=Math.abs(nums[i]-mid);
           i++;
       }
        
         return r;
        
    }
}