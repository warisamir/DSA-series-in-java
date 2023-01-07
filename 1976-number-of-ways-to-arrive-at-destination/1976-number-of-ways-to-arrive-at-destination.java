class Solution {
  static  int mod=1_000_000_007;
    class Pair{
       int node;
        int wt;
        Pair(int node ,int wt){
            this.node=node;
            this.wt=wt;
        }
    }
    public int countPaths(int n, int[][] roads) {
    ArrayList<Pair>[]adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int []edge:roads){
            adj[edge[0]].add(new Pair(edge[1],edge[2]));
            adj[edge[1]].add(new Pair(edge[0],edge[2]));
        }
      PriorityQueue<Pair> pq = new PriorityQueue<>((a, b)-> a.wt- b.wt);
        pq.offer(new Pair(0, 0));
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;


        int[] count = new int[n];
        count[0] = 1;
        while(!pq.isEmpty()){
            Pair front = pq.poll();

            for(Pair e: adj[front.node]){

                if(e.wt+ front.wt < dist[e.node]){
                    dist[e.node] = e.wt+ front.wt;
                    pq.offer(new Pair(e.node, dist[e.node]));
                    count[e.node] = count[front.node];
                }
                else if(e.wt+ front.wt == dist[e.node]){
                    count[e.node] = (count[e.node]+ count[front.node]) %mod;
                }
            }
        }
        return count[n-1]%mod;
    }
}