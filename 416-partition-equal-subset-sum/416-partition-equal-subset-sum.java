class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+= i;
        }
        if(sum%2!=0) 
            return false;
        sum/=2;
        Set<Integer>hs=new HashSet<>();
        hs.add(0);
        for(int n:nums){
            Set<Integer>hm=new HashSet<>(hs);
            for(Integer s:hm){
                if(s+n==sum)
                    return true;
                else if(s+n<=sum)
                    hs.add(s+n);
            }
        }
        return false;
    }
   
}