class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
         if(i==0)
             arr[i]=1;
            else
             arr[i]=arr[i-1]*nums[i-1];
        }
        int r=1;
        for(int i=nums.length-2;i>=0;i--){
            r=nums[i+1]*r;
            arr[i]=r*arr[i];
        }
        return arr;
    }
}