class Solution {
    public int[] twoSum(int[] nums, int t) {
      HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
          if(hm.containsKey(t-nums[i]))
             return new int[]{hm.get(t-nums[i]),i+1};
        hm.putIfAbsent(nums[i],i+1); 
        }
        return new int[0];
    }
}