//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maximizeSum(a, n, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {

    public static long maximizeSum(long arr[], int n, int k)
    {
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]<0 && k>0)
          {  arr[i]=(-arr[i]);
            k--;
          }
          else break;
        }
        Arrays.sort(arr);
        if(k>0)
        {
            if(k%2!=0)
            arr[0]*=-1;
        }
        long sum=0;
        for(long j:arr)
        sum+=j;
        return sum;
    }
}