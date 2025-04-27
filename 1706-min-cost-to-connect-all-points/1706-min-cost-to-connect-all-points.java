class Solution {
    public class Pair implements Comparable<Pair>{
        int id;
        int wt;
        Pair(int id,int wt){
            this.id=id;
            this.wt=wt;
        }
        public int compareTo(Pair other){
            return this.wt-other.wt;
        }
    }

    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        boolean vis[]=new boolean[n];
        PriorityQueue<Pair>pq= new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int cost=0, count=0;
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            if(vis[p.id]==true) continue ;
            vis[p.id]=true;
            cost=cost+p.wt;
            count++;
            if(count==n)break;
            for(int i=0;i<n;i++){
            int dist=Math.abs(points[p.id][0]-points[i][0])+Math.abs(points[p.id][1]-points[i][1]);
                pq.offer(new Pair(i,dist));
            }
        }
        return cost;
    }
}