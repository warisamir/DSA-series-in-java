class Solution {
    public boolean checkIfExist(int[] nums) {
//         HashMap<Integer,Integer>hm=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(hm.containsKey(nums[i])){
//                 hm.put(nums[i],hm.get(nums[i]+1));
//             }
//             else
//                 hm.put(nums[i],1);  
//         }
//         for(int i=0;i<nums.length;i++){
//             if(hm.containsKey(nums[i]*2) && hm.get(nums[i]%2)==0)
//                return true;
//         }
        
//         return false;
        HashSet <Integer>hs=new HashSet<Integer>();
        for(int i:nums){
            if(hs.contains(i*2)){
                return true;
            }
            if(hs.contains(i/2)&& i%2==0){
                return true;
            }
            hs.add(i);
        }
        return false;
    }
}