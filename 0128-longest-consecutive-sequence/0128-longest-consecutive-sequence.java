class Solution {
    public int longestConsecutive(int[] nums) {
      int n=nums.length;
       HashMap<Integer,Boolean>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],true);
        }
        for(int k:nums){
            if(hm.containsKey(k-1))
                hm.put(k,false);
        }
        int max=0;
        for(int i:nums){
            if(hm.get(i)==true)
            {
                int j=1;
                while(hm.containsKey(i+j))
                {  j++;
                 
                }max=Math.max(j,max);
            }
        }
        return max;
    }
}