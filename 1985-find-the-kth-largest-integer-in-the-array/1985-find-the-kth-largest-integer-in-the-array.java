import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue <BigInteger> pq=new PriorityQueue(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
        BigInteger bg=new BigInteger(nums[i]);
        pq.add(bg);
        }
        String h="0";
        while(k>0){
            h=pq.remove().toString();
            k--;
        }
        return h;
    }
}