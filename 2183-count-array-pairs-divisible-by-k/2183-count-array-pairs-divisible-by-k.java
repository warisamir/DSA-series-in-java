class Solution {
    public long countPairs(int[] nums, int k) {
     HashMap<Integer,Integer>hm=new HashMap<>();
        long ans=0;
        for(int i=0;i<nums.length;i++){
            int x=gcd(nums[i],k);
            for(int val:hm.keySet()){
               if((long)x*val%k==0) 
                   ans+=hm.get(val);
            }
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        return ans;
    } 
    public int gcd(int x,int y){
        if(x<y)
            return gcd(y,x);
        return y==0?x:gcd(y,x%y);
    }
}