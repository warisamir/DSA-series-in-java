class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int ans=0;
        int f=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==f%2){
                if(i+k>nums.length)
                    return -1;
            ans++;
            f++;
            nums[i]=-1;
        }
        if(i>=k-1 && nums[i-k+1]==-1){
            f--;
        }
        
    }return ans;
}
}