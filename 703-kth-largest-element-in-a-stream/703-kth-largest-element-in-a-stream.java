class KthLargest {
private PriorityQueue<Integer>pq;
    private int size;
    public KthLargest(int k, int[] nums) {
      this.size=k;
        pq=new PriorityQueue<>();
     for(int n:nums){
        add(n); 
     }
    
    }
    
    public int add(int val) {
       pq.offer(val);
        if(pq.size()>size){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */