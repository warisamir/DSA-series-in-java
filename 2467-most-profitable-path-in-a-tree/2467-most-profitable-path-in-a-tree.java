class Solution {
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n=amount.length;
        int par[]=new int[n];
        int alice[]=new int[n];
        Arrays.fill(alice,-1);
        List<Integer>[]adj=new ArrayList[n];
        for(int i=0;i<adj.length;i++){
            adj[i]=new ArrayList<>();
        }
        for(int edge[]:edges){
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }
        dfs(adj,0,-1,0,par,alice);
        for(int u=bob,bobd=0;u!=0;u=par[u],++bobd){
            if(bobd<alice[u])
                amount[u]=0;
            else if(bobd==alice[u])
                amount[u]/=2;
        }
        return getMoney(adj,0,-1,amount);
    }
    public void dfs(List<Integer>[]adj,int u,int prev,int d,int []par,int dis[]){
        par[u]=prev;
        dis[u]=d;
        for(int v:adj[u]){
            if(dis[v]==-1)
                dfs(adj,v,u,d+1,par,dis);
        }
    }
    public int getMoney(List<Integer>[] graph, int u, int prev, int[] amount) {
   
    if (graph[u].size() == 1 && graph[u].get(0) == prev)
      return amount[u];

    int maxPath = Integer.MIN_VALUE;
    for (final int v : graph[u])
      if (v != prev)
        maxPath = Math.max(maxPath, getMoney(graph, v, u, amount));

    return amount[u] + maxPath;
  }
}