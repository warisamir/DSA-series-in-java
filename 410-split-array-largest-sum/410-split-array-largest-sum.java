class Solution {
    public int splitArray(int[] nums, int m) {
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        int lef=0,rig=0;
        for(int x:nums)
        { lef=Math.max(lef,x);
        rig+=x;}
        int sum=rig;
        for(int x:nums){
            int mid=(lef+rig)/2;
            int ans=1,curr=0,currmax=0;
            for(int c:nums){
                if(c+curr>mid){
                    ans++;
                    currmax=Math.max(curr,currmax);
                    curr=0;
                }
                curr+=c;
            }
            currmax=Math.max(curr,currmax);
            
            if(ans>m){
                lef=mid+1;
            }
            else{
                rig=mid;
                if(ans==m){
                    res=Math.min(res,currmax);
                }
            }
        }
            return res==Integer.MAX_VALUE?lef:res;
        
    }
}