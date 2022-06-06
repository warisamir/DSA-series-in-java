class Solution {
    public List<Integer> findLonely(int[] nums) {
        List <Integer>l=new ArrayList<>();
      Arrays.sort(nums);
          
       for (int i = 0; i < nums.length; i++) {
            while (i + 1 < nums.length && nums[i + 1] - nums[i] <= 1) {
                i++;
            }
            if (i == 0 || nums[i] - nums[i-1] > 1) {
               l.add(nums[i]);
            }
        }
      
    
        return l;
}
}