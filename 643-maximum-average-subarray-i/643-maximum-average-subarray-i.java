class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s=0;
        for(int i=0;i<k;i++)
            s+=nums[i];
        int max=s;
        for(int i=k;i<nums.length;i++){
            s=s+nums[i]-nums[i-k];
            max=Math.max(s,max);
        }
        return (double)max/k;
    }
}