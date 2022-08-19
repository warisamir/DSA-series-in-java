class Solution {
    public int partitionDisjoint(int[] nums){
        int l[]=new int[nums.length];
        int r[]=new int[nums.length];
        int n=nums.length-1;
        l[0]=nums[0];
        r[n]=nums[n];
    for(int i=1;i<=n;i++){
        l[i]=Math.max(nums[i],l[i-1]);
    }
        for(int i=n-1;i>=0;i--){
            r[i]=Math.min(r[i+1],nums[i]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(l[i]<=r[i+1])
            {  res=i+1;
                break;
            }
        }
        return res;
}
}
