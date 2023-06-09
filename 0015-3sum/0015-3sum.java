class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    //    Arrays.sort(nums);
    //    // List<List<<Integer>>res=new ArrayList<>();
    //    List<List<Integer>> res = new ArrayList<>();
    //     for(int i=0;i<nums.length && nums[i]<=0;i++){
    //         if(i==0 ||nums[i-1]!=nums[i])
    //             sum2(nums,i,res);
    //     }
    //     return res;
    // }
    // void sum2(int nums[],int i,List<List<Integer>>res){
    //     int lo=i+1,hi=nums.length-1;
    //     while(lo<hi){
    //         int sum=nums[i]+nums[lo]+nums[hi];
    //         if (sum < 0 || (lo > i + 1 && nums[lo] == nums[lo - 1])) {
    //             ++lo;
    //         }
    //         else if ( sum > 0 || (hi < nums.length - 1 && nums[hi] == nums[hi + 1])) {
    //             --hi;
    //         }
    //         else {
    //             res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
    //         }
    //     }
    Arrays.sort(nums);
        Set<List<Integer>>res=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int lo=i+1,hi=nums.length-1;
            while(lo<hi){
                int sum=nums[i]+nums[lo]+nums[hi];
                if(sum<0)
                 lo++;
                else if(sum>0)
                    hi--;
                else
                {
                ArrayList<Integer>ls=new ArrayList<>();
                ls.add(nums[i]);
                 ls.add(nums[lo]);
                ls.add(nums[hi]);
                res.add(ls);
                    hi--;
                    lo++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}