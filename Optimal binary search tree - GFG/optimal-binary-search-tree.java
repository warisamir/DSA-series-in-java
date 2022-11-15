//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int keys[]= new int[n];
            for(int i = 0; i < n; i++)
                keys[i] = Integer.parseInt(input_line[i]);
            String input_line1[] = read.readLine().trim().split("\\s+");
            int freq[]= new int[n];
            for(int i = 0; i < n; i++)
                freq[i] = Integer.parseInt(input_line1[i]);
            Solution ob = new Solution();
            System.out.println(ob.optimalSearchTree(keys, freq, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int optimalSearchTree(int keys[], int freq[], int n)
    {
        // code here
        int dp[][]=new int [keys.length][keys.length];
        int psa[]=new int[freq.length];
        psa[0]=freq[0];
        for(int i=1;i<freq.length;i++){
            psa[i]=psa[i-1]+freq[i];
        }
        for(int g=0;g<dp[0].length;g++){
            for(int j=g,i=0;j<dp[0].length;i++,j++){
                if(g==0)dp[i][j]=freq[i];
              else{  if(g==1) dp[i][j]=Math.min(1*freq[i]+2*freq[j],2*freq[i]+1*freq[j]);
                else dp[i][j]=Integer.MAX_VALUE;
                for(int k2=g+1,k1=1;k2>=1;k2--,k1++){
                    int left=(j-k2==-1)?0:dp[i][j-k2];
                    int righ=(i+k1)==dp.length?0:dp[i+k1][j];
                    int fac=psa[j]-(i>0?psa[i-1]:0);
                    dp[i][j]=Math.min(dp[i][j],left+righ+fac);
                }
            }
        }}
        return dp[0][dp[0].length-1];
    }
}
