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
    public boolean dfs(int sr,int des,boolean vis[]){
        if(sr==des)return true;
        if(vis[sr]==true)
            return false;
        vis[sr]=true;
     for(int nbr:adj[sr]){
         if(dfs(nbr,des,vis)==true)return true;
     }   
        return false;
    }
    public boolean dfs(int src,int dest){
        boolean vis[]=new boolean[adj.length];
        return dfs(src,dest,vis);
    }
    public boolean BFS(int src,int dest){
        Queue<Integer>q=new ArrayDeque<>();
        boolean []vis=new boolean[adj.length];
        q.add(src);
        while(q.size()>0){
            int front= q.remove();
            if(vis[front]==true)continue;
            if(front==dest)return true;
            vis[front]=true;
            for(Integer nbr:adj[front]){
                if(vis[nbr]==false)
                    q.add(nbr);
            }
        }return false;
    }
    
    }
class Solution {
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Graph g=new Graph(n);
        for(int i=0;i<edges.length;i++){
            g.addEdge(edges[i][0],edges[i][1]);
        }
        
        return g.BFS(source,destination);
    }
}