class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xor=0;
        for(int n:nums){
            xor=(xor^n);
        }
        return xor;
    }
}