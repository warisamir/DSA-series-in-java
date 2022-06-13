class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int  n=nums.length;
       int s=0;
        int end=0;
        int ans=0;
        int sm=0;
        HashSet<Integer>hm=new HashSet<>();
        while(end<nums.length){
            while(s<end && hm.contains(nums[end])){
                hm.remove(nums[s]);
                sm-=nums[s++];
            }
            hm.add(nums[end]);
           sm+=nums[end++]; 
            ans=Math.max(ans,sm);
        
        }
        return ans;
    }
}