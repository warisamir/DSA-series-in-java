class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
       int[] freq = new int[nums.length + 1];
        List<List<Integer>> ans = new ArrayList<>();

        for (int c : nums) {
            if (freq[c] >= ans.size()) {
                ans.add(new ArrayList<>());
            }

            ans.get(freq[c]).add(c);
            freq[c]++;
        }
        return ans;
    }
}