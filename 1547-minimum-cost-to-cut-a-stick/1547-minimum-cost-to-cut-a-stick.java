class Solution {
   int A[];
    int dp[][];
    public int minCost(int n, int[] cuts) {
          A = new int[cuts.length + 2];
    System.arraycopy(cuts, 0, A, 1, cuts.length);
    A[0] = 0;
    A[A.length - 1] = n;

    Arrays.sort(A);
    dp = new int[A.length][A.length];
    return mincost(0, A.length - 1);
  }
    public int mincost(int i,int j){
        if(j-i<=1)
            return 0;
          if (dp[i][j] != 0)
      return dp[i][j];

    dp[i][j] = Integer.MAX_VALUE;

    for (int k = i + 1; k < j; ++k)
      dp[i][j] = Math.min(dp[i][j], A[j] - A[i] + mincost(i, k) + mincost(k, j));

    return dp[i][j];
    }
}