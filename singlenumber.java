class Solution {
    public int singleNumber(int[] nums) {
       int a= 0;
       for(int val : nums){
           a = a ^ val;
       } 
        return a;
    }
}
