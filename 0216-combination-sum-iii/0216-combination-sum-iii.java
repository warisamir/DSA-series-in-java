class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ls=new ArrayList<>();
      dfs(1,k,n,new LinkedList(),ls);
        return ls;
    }
    private void dfs(int st,int k,int n,LinkedList<Integer>ll,List<List<Integer>>ls){
        if(k<0 || n<0 )
            return ;
        if(k==0 && n==0)
        {   ls.add(new ArrayList(ll));return ;}
            for(int i=st;i<=9;i++){
                ll.add(i);
                dfs(i+1,k-1,n-i,ll,ls);
                ll.removeLast();
            }
    }
}