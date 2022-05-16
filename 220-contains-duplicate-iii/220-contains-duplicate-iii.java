class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k<1|| t<0)
           return false;
          SortedSet<Long> set = new TreeSet<Long>();
        for (int i = 0; i < nums.length; i++) {
            long left = (long) nums[i] - t;
            long right = (long) nums[i] + t + 1;
            SortedSet<Long> sb = set.subSet(left, right);
            if(!sb.isEmpty())
                return true;
            set.add((long)nums[i]);
            if(i>=k)
                set.remove((long)nums[i-k]);
        }
        return false;
    }
}