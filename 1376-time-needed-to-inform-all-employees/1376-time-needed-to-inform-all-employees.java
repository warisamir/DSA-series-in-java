class Pair{
    int nbr;
    int wt;
    Pair(int nbr,int wt){
        this.nbr=nbr;
        this.wt=wt;
    }
}
class Graph{
    ArrayList<Pair>[]adj;
    Graph(int n){
        adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
    }
    public void addEdge(int src,int nbr,int wt){
        adj[src].add(new Pair(nbr,wt));
    }
}
class Solution {
    public int dfs(int src,int time,Graph g){
        int max=time;
        for(Pair p: g.adj[src]){
            max=Math.max(max,dfs(p.nbr,time+p.wt,g));
        }
        return max;
    }
    
        
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
       Graph g=new Graph(n);
        int time=0;
        for(int i=0;i<n;i++){
            if(manager[i]==-1)
                time=informTime[i];
            else
           g.addEdge(manager[i],i,informTime[i]);
       } 
        return dfs(headID,time,g);
    }
}