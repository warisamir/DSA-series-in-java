class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k!=0) return false;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int key : nums){
          pq.offer(key);
        }
        while(!pq.isEmpty()){
            int pull = pq.peek();
            for(int i = 0;i<k;i++){
                if(!pq.remove(pull+i)){
                    return false;
                }
            }
        }
        return true;
    }
}