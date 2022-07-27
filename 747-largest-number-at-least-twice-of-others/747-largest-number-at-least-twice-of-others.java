class Solution {
    public int dominantIndex(int[] nums) {
        int lg=-1;int lg2=-1;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(lg==-1 ||nums[i]>nums[lg])
            {  lg2=lg;
            lg=i;}
            else if(lg2==-1 || nums[i]>nums[lg2]){
                lg2=i;
            }
        }
            if(nums[lg]>=2*nums[lg2])k=lg;
            else k=-1;
        
        return k;
    }
}