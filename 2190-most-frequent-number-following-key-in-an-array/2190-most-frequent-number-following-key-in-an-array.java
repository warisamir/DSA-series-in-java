class Solution {
    public int mostFrequent(int[] nums, int k) {
        int fr=Integer.MIN_VALUE,ans=0;
     HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==k)
                hm.put(nums[i+1],hm.getOrDefault(nums[i+1],0)+1);
        }
        for(int i:hm.keySet()){
            if(hm.get(i)>fr)
            {
                fr=hm.get(i);
                ans=i;
            }
        }
        return ans;
    }
}