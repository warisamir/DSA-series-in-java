//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Searching
{
    public static void main (String[] args)throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
           String a[] = read.readLine().trim().split("\\s+");
           int n = Integer.parseInt(a[0]);
           long x = Long.parseLong(a[(int)1]);
           String st[] = read.readLine().trim().split("\\s+");
        
           long arr[] = new long[n];
           for(int i = 0; i < n; i++)
           {
               arr[i] = Long.parseLong(st[i]);
           }
           
           System.out.println(new Solution().findFloor(arr, n, x));
          
        }
    }
    
}
// } Driver Code Ends


class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
       int s=0;
       int e=n-1,ans=-1;
       while(s<=e){
           int m=s+(e-s)/2;
           if(arr[m]==x)
           return m;
           else if(arr[m]<x)
           {s=m+1;
           ans=m;}
           else
          { e=e-1;
           }
       }
       return ans;
    }
    
}
