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
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Compute obj = new Compute();
            System.out.println(obj.maxSumWithK(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long maxSumWithK(long a[], long n, long k)
    {
        long res[]=new long[a.length];
        res[0]=a[0];
        long sum=a[0];
        for(int i=1;i<n;i++){
            if(sum<0)
            sum=a[i];
            else
            sum+=a[i];
            res[i]=sum;
        }
        long w=0;
        for(int i=0;i<k;i++)
        w+=a[i];
        long ans=w;
        for(int i=(int)k;i<a.length;i++){
            w=w+a[i]-a[i-(int)k];
       
           ans=Math.max(ans,Math.max(res[i-(int)k]+w,w));
        }
        return ans;
    }
}