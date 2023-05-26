class Solution {
    public int stoneGameII(int[] arr) {
        int n=arr.length;
        int dp[][]=new int[n+1][n+1];
        int prefixSum[]=new int[n+1];
          for (int i = n - 1; i >= 0; --i) {
            prefixSum[i] = prefixSum[i + 1] + arr[i];
        }
        for (int i = n - 1; i >= 0; --i) {
            for (int m = 1; m <= n; ++m) {
                if (i + 2 * m >= n) {
                    dp[i][m] = prefixSum[i];
                } else {
                    for (int x = 1; x <= 2 * m; ++x) {
                        dp[i][m] = Math.max(dp[i][m], prefixSum[i] - dp[i + x][Math.max(m, x)]);
                    }
                }
            }
        }
        return dp[0][1]; 
    }
}