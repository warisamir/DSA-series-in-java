import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for 'i'
            if (i == 0 || nums[i] != nums[i - 1]) {
                int lo = i + 1;
                int hi = nums.length - 1;
                int target = -nums[i];

                while (lo < hi) {
                    int sum = nums[lo] + nums[hi];

                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));

                        // Skip duplicates for 'lo' and 'hi'
                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi - 1]) hi--;

                        lo++;
                        hi--;
                    } else if (sum < target) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }

        return res;
    }
}
