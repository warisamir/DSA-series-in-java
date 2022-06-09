class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int s=0;
         for(int i=nums.length-1;i>=0;i--){
        s+=nums[i]-nums[0];
         
        }
         return s;
    }
}