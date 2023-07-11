class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        dfs(0,nums,new ArrayList<>(),res);
        return res;
    }
    public void dfs(int i,int arr[],List<Integer> ls,List<List<Integer>> res) {
         if(res.contains(ls)) return;
        if(i==arr.length){
            res.add(new ArrayList<>(ls));
            return;
        }
        ls.add(arr[i]);
        dfs(i+1, arr, ls, res);
        ls.remove(ls.size()-1);
        dfs(i+1,arr,ls,res);
    }
}