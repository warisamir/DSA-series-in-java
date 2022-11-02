class Solution {
    public int averageValue(int[] nums) {
        int ct=0,s=0;
        for(int i:nums){
            if(i%6==0)
            {   s+=i;
            ct++;
            }
        }
        return ct==0?0:s/ct;
    }
}