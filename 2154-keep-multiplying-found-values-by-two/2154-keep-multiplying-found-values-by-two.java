class Solution {
    public int findFinalValue(int[] nums, int o) {
     HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i]+1));
            }
            else
                hm.put(nums[i],1);  
        }
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(o)) break;
            o*=2;
        }
        return o;
        }
}