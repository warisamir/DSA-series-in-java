class Solution {
    public int waysToMakeFair(int[] nums) {
        int osum[]=new int[nums.length];
        int esum[]=new int[nums.length];
        int n=nums.length;
        int ods=0;
        int evs=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
                evs+=nums[i];
            else
               ods+=nums[i];
            osum[i]=ods;
            esum[i]=evs;
        }
        int ct=0;
        for(int i=0;i<n;i++){
            if(i==0)
            { 
            int odsum=esum[n-1]-nums[0];
            int evsum=osum[n-1];
            if(odsum==evsum)
                ct++;
                continue;
            }
            
            int evsum=esum[i-1]+osum[n-1]-osum[i];
            int odsum=osum[i-1]+esum[n-1]-esum[i];
            if(odsum==evsum)
                ct++;
        }
        return ct;
    }
}