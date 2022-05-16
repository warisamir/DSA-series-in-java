class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // HashMap<Integer,Integer> hm=new HashMap<>();
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]==nums[j] && Math.abs(i-j)<=k)
    //                 return true;
    //         }
    //     }
    //     return false;
    // }
        // Pair <Integer,Integer>p =new Pair<>();
        // for(int i=0;i<nums.length;i++)
        //     p
         HashMap<Integer,Integer> hm=new HashMap<>();
         for(int i=0;i<nums.length;i++){
             if(hm.containsKey(nums[i])){
                 if(i-hm.get(nums[i])<=k){
                     return true;
                 }
             }
             hm.put(nums[i],i);
         }
        return false;
    }
}