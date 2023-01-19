class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans=0;
        for(int i=0;i<32;i++){
          int zero=0,one=0;
               for(int j:nums)
            {
                if((j&(1<<i))==0) zero++;
                else one++;
            }
            ans+=zero*one;
            
        }
        return ans;
    }
}