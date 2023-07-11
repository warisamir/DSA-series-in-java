class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        dfs(0,nums,new ArrayList<>(),res);
        return res;
    }
    public void dfs(int idx,int nums[],List<Integer>ls,List<List<Integer>>res){
         res.add(new ArrayList<>(ls));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
        ls.add(nums[i]);
      dfs(i+1,nums,ls,res);
            ls.remove(ls.size()-1);
    }
    }
}