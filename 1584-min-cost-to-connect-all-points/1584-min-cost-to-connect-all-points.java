class Solution {
  public static class Pair implements Comparable <Pair>{
       int id,wt;
      Pair (int id,int wt){
          this.id=id;
          this.wt=wt;
      }
      public int compareTo(Pair other){
          return (this.wt-other.wt);
      }
    }
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        boolean vis[]=new boolean[n];
        PriorityQueue<Pair> q =new PriorityQueue<>();
        q.add(new Pair(0,0));
        int cost=0,ct=0;
        while(q.size()>0 && ct<n){
            Pair top=q.remove();
            if(vis[top.id]==true)continue;
            vis[top.id]=true;
            cost+=top.wt;
            ct++;
            for(int i=0;i<n;i++){
                if(top.id==i)
                    continue;
                int dis=Math.abs(points[top.id][0]-points[i][0])
                +Math.abs(points[top.id][1]-points[i][1]);
             q.add(new Pair(i,dis));
            }
        }
        return cost;
    }
}