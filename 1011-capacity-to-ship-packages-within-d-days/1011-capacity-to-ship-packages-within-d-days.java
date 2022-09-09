class Solution {
    public int shipWithinDays(int[] weights, int days) {
    int lo=Integer.MIN_VALUE;
        int hi=0;
        for(int val:weights){
            hi+=val;
            lo=Math.max(lo,val);
        }
        while(lo<hi){
            int ac=(lo+hi)/2;
            int partr=1;
            int currpwt=0;
            for(int val:weights){
                if(currpwt+val<=ac)
                    currpwt+=val;
                else{
                    currpwt=val;
                partr++;}
            }
            if(partr>days)
                lo=ac+1;
            else
                hi=ac;
        }
        return lo;
    }
}