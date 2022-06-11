class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans=0;
        for(int i=0;i<32;i++){
          int c1=0,c2=0;
               for(int j=0;j<nums.length;j++)
            {
                if((nums[j]&(1<<i))!=0) c1++;
                else c2++;
            }
            ans+=c1*c2;
            
        }
        return ans;
    }
}