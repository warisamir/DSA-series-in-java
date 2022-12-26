class Solution {
    public int[] answerQueries(int[] nums, int[] arr) {
      Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=Math.abs(~Arrays.binarySearch(nums,arr[i]));
        }
        return arr;
    }
}