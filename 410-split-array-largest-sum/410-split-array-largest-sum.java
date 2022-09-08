class Solution {
    public int splitArray(int[] nums, int m) {
       int lo=Integer.MIN_VALUE;
        int hi=0;
        for(int num:nums){
            hi+=num;
            lo=Math.max(lo,num);
        }
        while(lo<hi){
            int mid=(lo+hi)/2;
            int limit=mid;
            int cp=1,cpsum=0;
            for(int num:nums){
            if(cpsum+num<=limit){
                cpsum+=num ;
            }else
            {
                cpsum=num;
                cp++;
            }
        }
        if(cp>m)
            lo=mid+1;
        else
            hi=mid;
        }
    return lo;
}
}