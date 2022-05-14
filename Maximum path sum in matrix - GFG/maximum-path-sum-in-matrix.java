// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maximumPath(int N, int mat[][])
    {
          int n=mat.length;
            int m=mat[0].length;
        // code here
         int dp[][]=new int[n+1][m+1];
        int res=0;
    
        // Arrays.fill(dp,-1);
        for(int i=0;i<N;i++){
            int ans=maximumPath(0,i,mat,dp);
            res=Math.max(ans,res);
        }
        return res;
           }
static    int maximumPath(int sr ,int sc,int mat[][], int[][] dp)
    {
        // code here
        int lr=mat.length;
        int lc=mat[0].length;
       if(sr>=lr|| sr<0 || sc>=lc ||sc<0)return 0;
       if(sr==lr-1){
           dp[sr][sc]=mat[sr][sc];
       }
       if(dp[sr][sc]!=0) return dp[sr][sc]; 
       int ans=0;
       int down=maximumPath(sr+1,sc,mat,dp);
       int left=maximumPath(sr+1,sc-1,mat,dp);
       int right=maximumPath(sr+1,sc+1,mat,dp);
       dp[sr][sc]=mat[sr][sc] +Math.max(down,Math.max(left,right));
       return dp[sr][sc];
    }
}