class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int ct=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
          int  lcm=nums[i];
            if(lcm==k)
                ct++;
            for(int j=i+1;j<n;j++){
              int g=gcd(nums[j],lcm);
                lcm=(lcm*nums[j])/g;
                if(lcm>k) break;
                if(lcm==k) ct++;
            }
        }
        return ct;
    }
    public int gcd(int a,int b){
   if (b == 0)
   return a;
   return gcd(b, a % b);
}    
}