class Solution {
    Integer dp[][];
    public int maxNonDecreasingLength(int[] nums1, int[] nums2) {
        int n=nums1.length;
         dp=new Integer[n][3];
      return resolve(0,0,n,nums1,nums2);
      
    }
    public int resolve(int id,int choice,int n,int []nums1,int []nums2){
        if(id==n)
            return 0;
        if(dp[id][choice]!=null) return dp[id][choice];
        int maxlen=0;
        if(choice==0)
            maxlen=Math.max(maxlen,resolve(id+1,choice,n,nums1,nums2));
        int prev=choice==0?-1:choice==1?nums1[id-1]:nums2[id-1];
        if(nums1[id]>=prev)
            maxlen=Math.max(maxlen,1+resolve(id+1,1,n,nums1,nums2));
         if(nums2[id]>=prev)
            maxlen=Math.max(maxlen,1+resolve(id+1,2,n,nums1,nums2));
        return dp[id][choice]=maxlen;
    }
}