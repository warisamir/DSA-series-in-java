class Solution {
    public int maxResult(int[] nums, int k) {
       int m=nums[0];
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        pq.offer(new int[]{nums[0],0});
        for(int i=1;i<nums.length;i++){
            while(!(i-pq.peek()[1]<=k)){
                pq.poll();
        }
        int []top=pq.peek();
        m=nums[i]+top[0];
        pq.offer(new int[]{m,i});
    }
    return m;
}

}