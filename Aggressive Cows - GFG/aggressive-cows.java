//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int solve(int n, int k, int[] arr) {
        Arrays.sort(arr);
        int hi=arr[n-1]-arr[0];
        int lo=1;
        int ans=0;
       while(lo<=hi){
           int mid=(lo+hi)>>1;
            if (isCompatible(arr,n,k,mid)) {
              ans=mid;
              lo=mid+1;
            }
            else
            hi=mid-1;
        }
    return ans;
    }
    public static boolean isCompatible(int a[],int n,int k, int dist ) {
        int corr=a[0],ct=1;
        for(int i=1;i<n;i++){
            if((a[i]-corr)>=dist)
            {
                ct++;
                corr=a[i];
            }
            if(ct==k)
            return true;
        }
        
        return false;
    }
}