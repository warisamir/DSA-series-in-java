  class Graph{
    ArrayList<Integer>[] adj;
    Graph(int n){
        adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
    }
    //Unweight graph
    public void addEdge(int src,int dest){
        adj[src].add(dest);
        adj[dest].add(src);
    } 
      public void dfs(int src,boolean vis[],List<Integer>component){
        if(vis[src]==true)return;
        vis[src]=true;
        component.add(src);
        for(Integer nbr:adj[src]){
            dfs(nbr,vis,component);
        }
    }
   }
class Solution {
    public long countPairs(int n, int[][] edges) {
    Graph g=new Graph(n);
        for(int []edge:edges){
            g.addEdge(edge[0],edge[1]);
        }
        boolean vis[]=new boolean[n];
        List<List<Integer>>components=new ArrayList<>();
        long pairs=0;
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                List<Integer>component=new ArrayList<>();
                g.dfs(i,vis,component);
                pairs=pairs+(component.size())*(n*1L-component.size());
               
            }
        }
       return pairs/2l;
       
    }
}