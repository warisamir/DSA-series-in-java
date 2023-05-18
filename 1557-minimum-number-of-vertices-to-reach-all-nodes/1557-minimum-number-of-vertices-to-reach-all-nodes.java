class Solution { 
    static class DSU{
        int[] parent;
        public DSU(int n){
            parent = new int[n];
            for(int i=0;i<n;i++)
                parent[i]=i;
        }
        public int find(int a){
            if(parent[a]==a) return a;
            return find(parent[a]);
        }
        
        public void union(int a,int b) {
            parent[b] = find(a);
        }
public List<Integer>dfs(){
    List<Integer> ss = new ArrayList();
            for(int i=0;i<parent.length;i++)
                if(parent[i]==i)
                    ss.add(i);
            return ss;
}
    }
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        DSU d=new DSU(n);
        for(List<Integer>ls:edges){
            d.union(ls.get(0),ls.get(1));
        }
        return d.dfs();
    }
}