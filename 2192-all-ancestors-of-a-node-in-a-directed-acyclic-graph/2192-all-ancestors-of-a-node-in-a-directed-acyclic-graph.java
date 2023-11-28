class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<Integer>[]adj=new ArrayList[n];
        List<List<Integer>>ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            ls.add(new ArrayList<>());
            adj[i]=new ArrayList<>();
        }
        for(int []a:edges)adj[a[0]].add(a[1]);
        for(int i=0;i<n;i++){
            dfs(i,i,adj,ls);
        }
        return ls;
    }
    private void dfs(int x,int curr,List<Integer>[]adj,List<List<Integer>>ls){
        for(int nbr:adj[curr])
            if(ls.get(nbr).size() == 0 || ls.get(nbr).get(ls.get(nbr).size() - 1) != x) {
               ls.get(nbr).add(x);
            dfs(x,nbr,adj,ls);
        }
    }
}