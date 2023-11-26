class Solution {
    public int minImpossibleOR(int[] nums) {
       Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
         hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int a=1;
        while(hm.containsKey(a)){
            a=a*2;
        }
        return a;
    }
}