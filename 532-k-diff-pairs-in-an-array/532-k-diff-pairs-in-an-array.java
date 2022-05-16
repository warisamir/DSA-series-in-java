class Solution {
    public int findPairs(int[] nums, int k) {
          HashMap<Integer,Integer> hm=new  HashMap<>();
     int p=0,q=1;
        int count=0;
        int len=nums.length;
        while(p<len && q<len){
         int diff=Math.abs(nums[p]-nums[q]);
            if(diff==k){
                int x,y;
                if(nums[p]>nums[q])
                {
                    x=nums[p];
                    y=nums[q];
                }
                else
                {     x=nums[q];
                y=nums[p];
            }
                hm.put(x,y);
        }
            if(q==len-1){
            p++;
            q=p+1;
            }
            else q++;
        }
        return hm.size();
    }
}