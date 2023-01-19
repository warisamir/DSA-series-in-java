  class Pair implements Comparable<Pair>{
        int node,wt;
        Pair(int node,int wt){
            this.node=node;
            this.wt=wt;
        }
        public int compareTo(Pair other){
            return this.wt-other.wt;
        }
    }
class Solution {
  
    public int networkDelayTime(int[][] edge, int n, int k) {
        ArrayList<Pair>[]adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int edg[]:edge){
            adj[edg[0]-1].add(new Pair(edg[1]-1,edg[2]));
        }
        int vis[]=new int[n];
        PriorityQueue <Pair>q=new PriorityQueue<>();
        Arrays.fill(vis,Integer.MAX_VALUE);
        q.add(new Pair(k-1,0));
        while(q.size()>0){
            Pair front=q.remove();
            if(vis[front.node]!=Integer.MAX_VALUE)
                continue;
            vis[front.node]=front.wt;
            for(Pair nbr:adj[front.node]){
                q.add(new Pair(nbr.node,nbr.wt+front.wt));
            }
        }
        int time=vis[n-1];
        for(int i=0;i<n;i++){
            time=Math.max(time,vis[i]);
        }
        return (time==Integer.MAX_VALUE)?-1:time;
    }
}