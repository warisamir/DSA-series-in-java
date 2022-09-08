class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int lo=1;
        int hi=Integer.MIN_VALUE;
        for(int val:nums){
            if(val>hi)
                hi=val;
        }
        
        while(lo<hi){
            int mid=(lo+hi)/2;
            int sum=0;
            for(int val:nums){ 
                int q=(val+mid-1)/mid;
                sum+=q;
            }
            if(sum>threshold)
                lo=mid+1;
            else
                hi=mid;
        }
        return lo;
    }
} 