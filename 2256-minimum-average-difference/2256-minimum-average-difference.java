class Solution {
    public int minimumAverageDifference(int[] nums) {
          long s = 0,sum=0;
        for (int n : nums)
            s += n;
       
        for (int i = 0; i < nums.length - 1; i++) {
            sum += nums[i];
            s -= nums[i];
            nums[i] = (int) Math.abs((sum / (i + 1)) - (s/ (nums.length - i - 1)));
        }
        sum += nums[nums.length - 1];
        nums[nums.length - 1] = (int)(sum / nums.length);
        int min = Integer.MAX_VALUE, idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
                idx = i;
            }
        }
        return idx;
                            
    }
}