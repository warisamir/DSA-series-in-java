class Solution {
    public int majorityElement(int[] nums) {
        int ct=0;
        Integer ci=null;
        for(int i=0;i<nums.length;i++){
            if(ct==0)
            {  ct=1;
             ci=nums[i];
            }
            else if(nums[i]==ci)
                ct++;
            else
                ct--;
        }
        return ci;
    }
}