class Solution {
    public int numIdenticalPairs(int[] nums) {
         int count=0;
   HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }int a=0;
        for(int i:hm.values()){
                 a= i;
            count+=(a*(a-1))/2;
        }
        return count;
    }
}