//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0; i<N; i++)
                arr[i] = sc.nextInt();
            
            Solution g = new Solution();
            long ans = g.wineSelling(arr,N);
            
            System.out.println(ans);
            T--;
        }
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution {
    long wineSelling(int arr[],int n){
        // code here
        int sum=0;
        for(int i=0;i<n;i++){
          sum+=arr[i];
          arr[i]=sum;
        }
        Long sun=0L;
        for(int k:arr){
            sun=sun+Math.abs(k);
        }
        return sun;
    }
}

//{ Driver Code Starts.
// } Driver Code Ends