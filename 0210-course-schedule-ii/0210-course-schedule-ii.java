class Solution {
    public int[] findOrder(int n, int[][] edges) {
        ArrayList<Integer>adj[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int edge[]:edges){
            adj[edge[1]].add(edge[0]);
        }
      return bfs(n,adj);
    } 
    public int[] bfs(int n,ArrayList<Integer>[]adj){
        int income[]=new int[n];
        for(int src=0;src<n;src++){
            for(Integer nbr:adj[src]){
                income[nbr]++;
            }
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(income[i]==0)
                q.add(i);
        }
            // int visited=0;
        int topo[]=new int[n];
        int idx=0;
        int ct=0;
        while(q.size()>0){
           int src=q.remove(); 
            topo[idx++]=src;
            ct++;
            for(Integer nbr:adj[src]){
                income[nbr]--;
            if(income[nbr]==0)
                q.add(nbr);
            }
        }
        if(ct==n)
            return topo;
            return new int[0];
    }
}