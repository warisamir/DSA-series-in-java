class Solution {
    public boolean isNStraightHand(int[] hand, int k) {
        if(hand.length%k!=0) return false;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int ar:hand){
            pq.add(ar);
        }
            
        while(!pq.isEmpty()){
            int cur=pq.peek();
            for(int i=0;i<k;i++){
           if(!pq.remove(cur+i)) return false;
        }
        }return true;
    }
}