class Solution {
    public long zeroFilledSubarray(int[] nums) {
       long ans=0;
        int a=0;
        for(int i:nums)
        {
            if(i==0)
            {  a++;
            ans+=a;}
            else
                a=0;
        }
        return ans;
    }
}