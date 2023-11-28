class Solution {
    public boolean canFinish(int n, int[][] edge) {
        ArrayList<Integer>[]adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int e[]:edge){
            adj[e[0]].add(e[1]);
        }
        int vis[]=new int[n];
        Arrays.fill(vis,-1);
        for(int i=0;i<n;i++){
            if(vis[i]==-1 && dfs(i,vis,adj)==true)
                return false;
        }
        return true;
    }
    private boolean dfs(int src,int []vis,ArrayList<Integer>[]adj){
        if(vis[src]==0)
            return true;
        if(vis[src]==1) return false;
        vis[src]=0;
        for(int nbr:adj[src])
        {
            if(dfs(nbr,vis,adj)==true)
                return true;
        }
        vis[src]=1;
        return false;
    }
}