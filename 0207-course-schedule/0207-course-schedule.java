class Solution {
    public boolean canFinish(int n, int[][] adj) {
        
        //it cycle is detected then schedule is not possible
        //if acyclic -> true;
        //wherer incoming is not zero for a graph 
        
        //if topological sort is not possible if cyclic 
        // boolean vis[]=new boolean[n];
        ArrayList<Integer>[]ad=new ArrayList[n];
        for(int i=0;i<n;i++){
            ad[i]=new ArrayList<>();
        }
        for(int edge[]:adj){
           ad[edge[0]].add(edge[1]);
            // ad[edge[1]].add(edge[0]);
        }
        int vis[]=new int[n];
        Arrays.fill(vis,-1);
        for(int i=0;i<n;i++){
            if(vis[i]==-1 && dfs(i,ad,vis)==true)return false;
        }
        return true;
    }
    
    public boolean dfs(int src,ArrayList<Integer>[]adj,int vis[]){
        if(vis[src]==0)return true;
        if(vis[src]==1) return false;
        vis[src]=0;
        for(Integer nbr:adj[src]){
            if(dfs(nbr,adj,vis)==true)
                return true;
        }
        vis[src]=1;
        return false;
    }
}