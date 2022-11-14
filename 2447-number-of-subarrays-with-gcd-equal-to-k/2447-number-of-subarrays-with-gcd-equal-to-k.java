class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int ct=0;
       
        for(int i=0;i<nums.length;i++){
            int g=nums[i];
            if(g==k)ct++;
           for(int j=i+1;j<nums.length;j++){
               g=gcd(nums[j],g);
               if(nums[j]<k)
                   break;
               if(g==k)
                   ct++;
           } 
        }
        return ct;
        
    }
    public int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
