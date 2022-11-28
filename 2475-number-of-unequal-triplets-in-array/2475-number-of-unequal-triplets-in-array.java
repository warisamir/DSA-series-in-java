class Solution {
    public int unequalTriplets(int[] nums) {
       int res=0,left=0;
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>s:hm.entrySet()){
            n=n-s.getValue();
            res+=n*left*s.getValue();
            left+=s.getValue();
        }
        return res;
    }
}