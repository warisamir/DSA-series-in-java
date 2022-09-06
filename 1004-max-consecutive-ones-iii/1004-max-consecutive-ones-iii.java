class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0;
        int res=0;
        int cz=0;
        while(i<nums.length){
           if(nums[i]==0)
               cz++;
        
        while(cz>k){
            if(nums[j]==0)
            cz--;
            j++;
        }
        int l=i-j+1;
        res=Math.max(res,l);
        i++;
    }
    return res;
    }
}