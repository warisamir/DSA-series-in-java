class Solution {
 public int minGroups(int[][]dp) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
     Arrays.sort(dp,(a,b)->a[0]-b[0]);
   
    for(int[] ent:dp){
     if(!pq.isEmpty() && pq.peek()< ent[0])
     {    pq.poll();
    }
     pq.offer(ent[1]);
    } return pq.size();
 }
 
    
}