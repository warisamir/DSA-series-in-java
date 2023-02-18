class Solution {
  static class DSU{
        int par[];
        int rank[];
        DSU(int n){
            par=new int[n];
            rank=new int[n];
            Arrays.fill(par,-1);
            Arrays.fill(rank,-1);
        }
        public void union(int a ,int b){
            int pa=find(a);
            int pb=find(b);
            if(pa==pb)
                return;
            if(rank[pa]>rank[pb])
            { 
                par[pb]=pa;
                rank[pa]+=rank[pb];
            }
            else{
                par[pa]=pb;
                rank[pb]+=rank[pa];
            }
            // par[pb]=pa;
        }
        public int find(int a){
            if(par[a]==-1) return a;
           return par[a]=find(par[a]);
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int V=1001;
        DSU set=new DSU(V+1);
        for(int edge[]:edges){
           int a=edge[0],b=edge[1];
            if(set.find(a)==set.find(b))
                return edge;
            set.union(a,b);
        }
        return null;
    }
}