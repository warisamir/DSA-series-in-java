class Solution {
    public int maxProduct(int[] nums) {
      int max=nums[0];
        int min=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=0){
                max=Math.max(max*nums[i],nums[i]);
                min=Math.min(min*nums[i],nums[i]);
            }
            else {
                int temp=max;
                max=Math.max(min*nums[i],nums[i]);
                min=Math.min(temp*nums[i],nums[i]);
            }
        res= Math.max(res,max);
        }
        return res;
    }
}
