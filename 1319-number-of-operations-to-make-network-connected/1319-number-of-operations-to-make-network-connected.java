class Graph{
    public ArrayList<Integer>[] adj;
    Graph(int n){
        adj=new ArrayList[n];
        for(int i=0;i<n;++i){
            adj[i]=new ArrayList<>();
            }
    }
    public void addEdge(int src,int des){
        adj[src].add(des);
        adj[des].add(src);
    }
}
class Solution {
    public int makeConnected(int n, int[][] connections) {
         Graph g=new Graph(n);
         if(connections.length<n-1) return -1;
        int pr=0;
        for(int []edge:connections){
            g.addEdge(edge[0],edge[1]);}
            boolean vis[]=new boolean[n];
            for(int i=0;i<n;++i){
                if(vis[i]==false){
                dfs(i,vis,g);
            pr++;
            }
        } return pr-1;
    }
    public void dfs(int src,boolean []vis,Graph g){
        if(vis[src]==true)
            return ;
        vis[src]=true;
        // component.add(src);
        for(Integer nbr:g.adj[src]){
            dfs(nbr,vis,g);
        }
    }
}