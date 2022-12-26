class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int bag[]=new int[101];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            bag[i]++;
            if(max<i)
                max=i;
            if(min>i)
                min=i;
        }
        int n=nums.length;
         int res[]=new int[n];
        for(int i=max;i>=min;i--){
            if(bag[i]!=0)
            {n-=bag[i];
            bag[i]=n;}
        }
        int i=0;
        for(int k:nums){
            res[i++]=bag[k];
        }
        return res;
    }
    
}