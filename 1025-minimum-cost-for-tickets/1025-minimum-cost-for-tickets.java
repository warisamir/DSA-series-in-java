class Solution {
    public int mincostTickets(int[] days, int[] costs) {
      int n = days.length;

        // maxDay denotes the maximum day up to which we have to find the cost
        int maxDay = days[n - 1];

        // the dp array stores the minimum cost of each day -> till maxDay
        // i.e dp[i] is the minimum cost on day i
        int[] dp = new int[maxDay + 1];

        // Set stores all the days which were present in the days array
        Set<Integer> daySet = new HashSet<>();
        for (int day : days) {
            daySet.add(day);
        }

        for (int i = 1; i <= maxDay; i++) {
            // if the day i was not present in the days array then the minimum cost for that day will be equal to its previous
            if (!daySet.contains(i)) {
                dp[i] = dp[i - 1];
                continue;
            }
            // calculate the cost for all possible 3 steps
            int step1 = costs[0] + dp[Math.max(0, i - 1)];
            int step2 = costs[1] + dp[Math.max(0, i - 7)];
            int step3 = costs[2] + dp[Math.max(0, i - 30)];
            // the minimum cost for that day will be the minimum of all three steps
            dp[i] = Math.min(step1, Math.min(step2, step3));
        }
        // return the minimum cost which was achieved at maxDay
        return dp[maxDay];
    }
}