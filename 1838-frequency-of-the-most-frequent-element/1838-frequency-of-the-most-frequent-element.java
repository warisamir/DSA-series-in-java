class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int c=0,res=0;
        int diff=0;
        int max=0;
        for(int j=0;j<nums.length;j++){
            c=c+diff*(j-i);
            while(c>k){
                c=c-nums[j]+nums[i];
                i++;
            }
            res=Math.max(res,j-i+1);
            if(j+1<nums.length)
                diff=nums[j+1]-nums[j];
        }
        return res;
    }}
         

    