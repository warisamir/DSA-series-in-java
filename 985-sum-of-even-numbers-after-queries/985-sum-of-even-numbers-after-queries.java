class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] arr) {
        int s=0;
        for(int i:nums){
            if(i%2==0){
           s+=i; 
            }
        }
        int ans[]=new int[arr.length];
        for(int i=0;i<nums.length;i++){
            int  id=arr[i][1];
            int val=arr[i][0];
            if(nums[id]%2==0)
            s-=nums[id]; 
            nums[id]+=val;
            if(nums[id]%2==0)
            { 
                s+=nums[id];
            }
            ans[i]=s;
        }
        return ans;
    }
}