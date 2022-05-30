class Solution {
    public int finalValueAfterOperations(String[] nums) {
        int a=0;
        for(String x: nums)
           a+=(x.charAt(1)=='+')?1:-1;
        return a;
    }
}