class Solution {
    public int numRescueBoats(int[] num, int l) {
       int mx=0;
      Arrays.sort(num);
       int lf=0,r=num.length-1;
         while(lf<r){
          int val=num[lf]+num[r];
            if(val<=l)
            {
                mx++;
                lf++;r--;
            }
             else{
                 mx++;r--;
             }
             if(lf==r)mx++;
         }return mx;
                
             
            
    }
}