class Solution {
    public int lengthOfLIS(int[] nums) {
        int lis[]=new int[nums.length];
        lis[0]=1;
        for(int i=1;i<nums.length;i++){
            int max=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i])
                    max=Math.max(lis[j],max);
            } lis[i]=max+1;
        }
       int l=0;
        for(int val:lis){
            l=Math.max(val,l);
        }
        return l;
    }
}