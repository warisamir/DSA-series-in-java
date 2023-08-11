class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        int ct=arr.length-k+1;
        for(int a:arr){
            pq.offer(a);
            if(pq.size()>ct)
                pq.poll();
        }
        return pq.poll();
    }
}