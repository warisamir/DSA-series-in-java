class Solution {
    class Edge {
    int src;
    int nbr;
    int a;
    Edge(int src, int nbr,int a) {
        this.src = src;
        this.nbr = nbr;
        this.a = a;
    }
}
    public int minReorder(int n, int[][] connections) {
         ArrayList<Edge>[]arr=new ArrayList[n];
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<Edge>();
        }
        for(int con[]:connections){
           arr[con[0]].add(new Edge(con[0],con[1],1));
            arr[con[1]].add(new Edge(con[1],con[0],-1));
        }
       return  dfs(arr,0,vis);
    }
    public int dfs(ArrayList<Edge>[]adj,int src,boolean vis[]){
        int ct = 0;
    vis[src] = true;
    for(Edge e: adj[src]){
        if(!vis[e.nbr]){
            if(e.a==1){
                ct++;
            }
            ct += dfs(adj, e.nbr, vis);
        }
    }return ct;
        
    }
}
    