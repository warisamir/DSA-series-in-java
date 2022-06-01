class Solution {
    public int maxProduct(int[] nums) {
  int min = nums[0];
        int max = nums[0];
        int product = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int possibleMin = min * nums[i];
            int possibleMax = max * nums[i];
            
            min = Math.min(Math.min(nums[i], possibleMin), possibleMax);
            max = Math.max(Math.max(nums[i], possibleMax), possibleMin);
            
            product = Math.max(max, product);
            
    }
        return product;
}
}
