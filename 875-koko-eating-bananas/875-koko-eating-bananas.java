class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int hi=0;
        for(int p:piles){
            
            hi=Math.max(hi,p);
        }
        while(lo<hi){
            int mid=(lo+hi)/2;
            int currp=0;
            
            for(int val:piles){
               int time=(val+mid-1)/mid;
                    currp+=time;
              
            }
            if(currp>h)
                lo=mid+1;
            else
                hi=mid;
        }
        return lo;
    }
}