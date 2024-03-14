class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer>hm=new HashMap<>();
        int presm=0;
        hm.put(0,1);
        int sbarrct=0;
        for(int a:nums){
            presm+=a;
            if(hm.containsKey(presm-goal))
                sbarrct+=hm.get(presm-goal);
        hm.put(presm,hm.getOrDefault(presm,0)+1);    
        }
        return sbarrct;
    }
}