class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int []ans=new int[nums.length];
       int even=0,odd=1;
        for(int x:nums){
            if(x%2==0){
                ans[even]=x;
                even+=2;
            }
            else{
                ans[odd]=x;
                odd+=2;
            }
        }
        return ans;
    }
}