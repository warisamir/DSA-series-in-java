class Solution {
    public int longestNiceSubarray(int[] nums) {
       int and=0,i=0,res=0,n=nums.length;
        for(int j=0;j<n;j++){
            while((and&nums[j])>0)
                and^=nums[i++];
                and|=nums[j];
            
        res=Math.max(res,j-i+1);
        }
       return res;
    }
}