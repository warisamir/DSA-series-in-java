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
    }
class Solution {
    public boolean dfs(int sr,int des,Graph g,boolean vis[]){
        if(sr==des)return true;
        if(vis[sr]==true)
            return false;
        vis[sr]=true;
     for(int nbr:g.adj[sr]){
         if(dfs(nbr,des,g,vis)==true)return true;
     }   
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Graph g=new Graph(n);
        for(int i=0;i<edges.length;i++){
            g.addEdge(edges[i][0],edges[i][1]);
        }
        boolean vis[]=new boolean[n];
        return dfs(source,destination,g,vis);
    }
}