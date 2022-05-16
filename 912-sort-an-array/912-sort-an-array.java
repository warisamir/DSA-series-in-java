class Solution {
    public int[] sortArray(int[] nums) {
        Queue<Integer> q=new PriorityQueue<>();
        for(int i:nums){
            q.add(i);
        }
        int i = 0;
        while (q.size() > 0)
            nums[i++] = q.poll();
        return nums;
       
    }
}