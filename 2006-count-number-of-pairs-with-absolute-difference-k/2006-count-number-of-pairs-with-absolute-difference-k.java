class Solution {
    public int countKDifference(int[] nums, int k) {
       int count[]=new int[101];
      int kMax=100;
        int ans=0;
        for(int n:nums)
           count[n]++;

    for (int i = k + 1; i <= kMax; ++i)
      ans += count[i] * count[i - k];
        return ans;
    }
}