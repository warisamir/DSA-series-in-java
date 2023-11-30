class Solution {
    public int singleNonDuplicate(int[] nums) {
        int x=0;
        for(int n:nums){
            x^=n;
        }
        return x;
    }
}