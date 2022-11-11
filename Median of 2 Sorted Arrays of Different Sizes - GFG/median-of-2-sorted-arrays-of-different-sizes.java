//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
       ArrayList<Integer>ls=new ArrayList<>();
       for(int i:a){
           ls.add(i);
       }
       for(int i:b)
       ls.add(i);
       Collections.sort(ls);
       int sz=ls.size();
       double md;
       if(sz%2!=0)
       md=ls.get(ls.size()/2);
       else
       md=(ls.get((sz/2)-1)+ls.get(sz/2))/2.0;
    
    return md;
    }
}