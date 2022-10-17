class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;
        int count = 0, size = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }

        while (count < size) {
            nums[count] = 0;
            count++;
        }
    }
}
