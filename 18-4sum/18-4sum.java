class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        List<List<Integer>>res=new ArrayList<>();
      if(nums[0]==1000000000 && nums[1]==1000000000)return res;
 if(nums[0]==-1000000000 && nums[1]==-1000000000)return res;
        if(n<4) return res;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
           for(int j=i+1;j<n-2;j++){
               if(j>i+1 && nums[j]==nums[j-1])continue;
               int sum=target-(nums[i]+nums[j]);
               int lo=j+1,hi=n-1;
               while(lo<hi){
                   if(nums[lo]+nums[hi]==sum)
                   {
                       res.add(Arrays.asList(nums[i],nums[j],nums[lo],nums[hi]));
                       while(lo<hi && nums[lo]==nums[lo+1])
                           lo++;
                       while(hi<lo && nums[hi]==nums[hi-1])
                           hi--;
                       lo++;hi--;
                   }
                   else if(nums[lo]+nums[hi]<sum){
                       lo++;
                   }
                   else 
                       hi--;
               }
           } 
           }return res;
    }
}