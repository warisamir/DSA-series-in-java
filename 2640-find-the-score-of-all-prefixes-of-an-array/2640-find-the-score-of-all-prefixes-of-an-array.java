class Solution {
      // بِسمِ اللہِ الرَّحِنِ الرَّحِيم
    public long[] findPrefixScore(int[] nums) {
        long arr[]=new long[nums.length];
        
        int mx=Integer.MIN_VALUE;
        long conv=0,iscore=0;
        for(int i=0;i<nums.length;i++){
          mx=Math.max(mx,nums[i]);
            conv=mx+nums[i];
            iscore+=conv;
            arr[i]=iscore;
            
        }
        return arr;
    }
}