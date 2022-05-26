class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
      HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<nums.length;i++){
             if(hs.contains(nums[i]))
                ans.add(nums[i]);
            else
                hs.add(nums[i]);

        }
        return ans;
    }
} 