class Solution {
    public int maxProduct(int[] nums) {
        int min=Integer.MIN_VALUE;
        int pro=1;
        for(int i:nums){
            pro*=i;
            if(pro>min)
                min=pro;
          if(pro==0)
              pro=1;
        }
        pro=1;
        for(int i=nums.length-1;i>=0;i--){
            pro*=nums[i];
            if(pro>min)
                min=pro;
          if(pro==0)
              pro=1;
        }
        return min;
    }
}
