class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int lo=1;
        int hi=0;
        for(int vl:nums){
            hi=Math.max(hi,vl);
        }
    while(lo<hi){
        int mid=(lo+hi)/2;
        int oprq=0;
       for(int bal:nums){
           if(bal>mid)
           { int spr=bal-mid;
               int ops=(spr+mid-1)/mid;
            oprq+=ops;
       }
       }
           if(oprq>maxOperations)
               lo=mid+1;
           else
               hi=mid;
    }
    
        return lo;
    }
}