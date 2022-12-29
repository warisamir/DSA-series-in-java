class Pair{
    int avt=0;
    int burst=0;
    int id=0;
    Pair(int avt,int burst,int id){
        this.avt=avt;
        this.burst=burst;
        this.id=id;
    }
}
class Solution {
    public int[] getOrder(int[][] task) {
    List<Pair>ll=new ArrayList<>();
        for(int i=0;i<task.length;i++){
            ll.add(new Pair(task[i][0],task[i][1],i));
        }
        Collections.sort(ll,(a,b)->(a.avt==b.avt)?a.burst-b.burst:a.avt-b.avt);
        int time=0;
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->(a.burst==b.burst)?a.id-b.id:a.burst-b.burst);
        int ans[]=new int[ll.size()];
        int ind=0;
        int idx=0;
        while(idx<ll.size()){
            while(ind<ll.size() && ll.get(ind).avt<=time){
                pq.add(ll.get(ind));
                ind++;
            }
            if(pq.isEmpty()){
                time=ll.get(ind).avt;
                continue;
            }
            Pair p=pq.poll();
            ans[idx++]=p.id;
            time+=p.burst;
        }return ans;
    }
}