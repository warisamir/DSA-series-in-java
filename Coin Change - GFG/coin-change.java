//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int coins[], int n, int sum) {
        long dp[][]=new long[sum+1][n+1];
        for(int i=0; i<=n; i++) dp[0][i] = 1;
            for(int i=1; i<=sum; i++) dp[i][0] = 0;
            
            for(int i=1; i<=sum; i++) {
                for(int j=1; j<=n; j++) {
                    
                    dp[i][j] = dp[i][j-1]; 
                    
                    if(coins[j-1] <= i) { 
                        dp[i][j] += dp[i - coins[j-1]][j]; 
                    }
                }
                
            }
        return dp[sum][n];
    }
}