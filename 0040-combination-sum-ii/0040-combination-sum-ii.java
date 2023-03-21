class Solution {
    List<List<Integer>>ls=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] nums, int t) {
      Arrays.sort(nums);
          dfs(0,nums,new ArrayList<>(),t);
        return ls;
    }
    public void dfs(int id,int nums[],List<Integer>res,int t){
        if(t<0)
            return ;
        else if(t==0)
        {
            ls.add(new ArrayList(res));
            return;
        }
        for(int i=id;i<nums.length;i++){
            if(i>id && nums[i]==nums[i-1])
                continue;
            res.add(nums[i]);
            dfs(i+1,nums,res,t-nums[i]);
            res.remove(res.size()-1);
        }
    }
}