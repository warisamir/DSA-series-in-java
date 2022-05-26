class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int ct=0;
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<hm.size();i++){
           if(hm.get(nums[i])>1)
            ct= nums[i];
        }
        return ct;
    }
}