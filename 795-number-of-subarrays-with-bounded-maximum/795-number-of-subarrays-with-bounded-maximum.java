class Solution {
    public int numSubarrayBoundedMax(int[] nums, int l, int r) {
       int s=-1 ,e=-1,res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=l && nums[i]<=r){
                e=i;
            }
            else if(nums[i]>r){
               e=s=i; 
            }
            
            res+=(e-s);
        }
        return res;
    }
}