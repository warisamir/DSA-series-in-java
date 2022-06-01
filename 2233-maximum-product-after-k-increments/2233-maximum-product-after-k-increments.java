class Solution {
    public int maximumProduct(int[] nums, int k) {
        int MOD = 1_000_000_007;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.add(num);
        }
        while(k-- > 0){
            pq.add(pq.poll()+1);
        }
        long product = 1;
        while(!pq.isEmpty()){
            product*=(pq.poll());
            product = product % MOD;
        }
        return (int)product;
    }
}

