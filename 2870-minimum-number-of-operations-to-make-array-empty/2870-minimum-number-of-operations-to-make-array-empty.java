class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int ct=0;
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            int val=entry.getValue();
            if(val==1)
                return -1;
            ct+=val/3;
            if(val%3!=0)
                ct++;
        }
        return ct;
    }
}