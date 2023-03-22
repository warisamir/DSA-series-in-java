class Solution {
    private int sc=Integer.MAX_VALUE;
    private List<int[]>[]adj;
    private boolean vis[];
    public int minScore(int n, int[][] roads) {
        adj=new List[n+1];
        
        for(int i=0;i<n+1;i++){
            adj[i]=new ArrayList<>();
        }
        
        for(int rd[]:roads){
            adj[rd[0]].add(new int[]{rd[1],rd[2]});
            adj[rd[1]].add(new int[]{rd[0],rd[2]});
        }
        
        vis =new boolean[n+1];
        vis[1]=true;
        dfs(1);
        return sc; 
    }
    public void dfs(int curr){
        for(int []nbr:adj[curr]){
            int nxt=nbr[0];
            int dis=nbr[1];
            
            sc=Math.min(sc,dis);
            if(!vis[nxt])
            {  
                vis[nxt]=true;
                dfs(nxt);
            }
        }
    }
}

//     class Pair{
//     int nbr,wt;
//    //weight graph pair
//     Pair(int nbr,int wt){
//         this.nbr=nbr;
//         this.wt=wt;
//     }
//     //unweighted graph pair
//     Pair(int nbr){this(nbr,1);}
// }
// class Graph{
//     //graph has a pair
//     ArrayList<Pair>[] adj;
//     Graph(int n){
//         adj=new ArrayList[n];
//         for(int i=0;i<n;i++){
//             adj[i]=new ArrayList<>();
//         }
//     }
   
//     //weight Graph
//      public void addEdge(int src,int dest,boolean directed){
//         adj[src].add(new Pair(dest));
//         // if(directed==false)
//         adj[dest].add(new Pair(src));
//     }
//     }
// }