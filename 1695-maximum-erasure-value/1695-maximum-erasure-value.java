class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int  n=nums.length;
        int arr[]=new int[100_001];
        int curr=0,max=0;
        int right=0,left=0;
        while(right<n){
            arr[nums[right]]++;
            curr+=nums[right];
            while(right< n && arr[nums[right]]>1)
            {
                arr[nums[left]]--;
                curr-=nums[left];
               left++;
                           
            }
            max=Math.max(max,curr);
            right++;
        }
        return max;
    }
}