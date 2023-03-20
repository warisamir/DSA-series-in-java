class Solution {
    List<List<Integer>>ls=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer>res=new ArrayList<>();
        dfs(n,k,res);
        return ls;
    }
    public void dfs(int n,int k,List<Integer>res){
       if(k==0){
           ls.add(new ArrayList<>(res));
           return ;
       }
          if(n==0)
             return;
        dfs(n-1,k,res);
        res.add(n);
        dfs(n-1,k-1,res);
        res.remove(res.size()-1);
    }
}