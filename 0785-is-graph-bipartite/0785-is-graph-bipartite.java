class Solution {
    public boolean isBipartite(int[][] graph,int src,int level,int vis[]) {
        if(vis[src]!=-1 ){
          if( vis[src]!=level%2 )
            return false;
            return true;
        }
        vis[src]=level%2;
        for(Integer nbr:graph[src]){
            if(isBipartite(graph,nbr,level+1,vis)==false)
                return false;//cycle of odd length;
        }
        return true;
    }
    public boolean isBipartite(int [][]graph){
        int vis[]=new int[graph.length];
        Arrays.fill(vis,-1);
        for(int i=0;i<graph.length;i++){
            if(vis[i]==-1 && isBipartite(graph, i,0,vis)==false)
                return false;
        }
        return true;
    }
}