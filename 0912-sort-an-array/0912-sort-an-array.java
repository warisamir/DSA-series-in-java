class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        int max=nums[0];
        for(int k:nums){
            max=Math.max(max,k);
            min=Math.min(min,k);
        }
        int len=max-min;
        int arr[]=new int[len+1];
        for(int k:nums){
            arr[k-min]++;
        }
        int id=0;
        for(int i=0;i<=len;i++){
            while(arr[i]>0)
            {
                nums[id]=min;
                id++;
                arr[i]--;
            }
            min++;
        }
            return nums;
       
    }
}