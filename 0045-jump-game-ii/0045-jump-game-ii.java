class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1)
            return 0;
        int ans=0,prev=0;
        int curr=0;
        while(curr<nums.length){
            if(curr+nums[curr]>=nums.length-1)
            {
                ans++;break;
            }
            int inter=curr;
            for(int j=prev+1;j<=curr+nums[curr] && j<nums.length;j++){
                if(inter+nums[inter]<j+nums[j])
                    inter=j;
            }
            prev=curr+nums[curr];
            curr=inter;
            ans++;
        }
        return ans;
    }
}