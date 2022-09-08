class Solution {
    public boolean findSubarrays(int[] nums) {
       
     HashSet<Long>hs=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            long s=nums[i+1]+nums[i];
            if(hs.contains(s))
                return true;
                hs.add(s);
        }
    return false;
    }
}