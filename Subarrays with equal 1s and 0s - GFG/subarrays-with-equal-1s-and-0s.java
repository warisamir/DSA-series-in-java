//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
 {
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int t= in.nextInt();
	   while(t-->0){
	       
	       int n = in.nextInt();
	       int [] arr= new int[n];
	       for(int i=0;i<n;i++) {
	           arr[i] = in.nextInt();
	       }
	       System.out.println(new Solution().countSubarrWithEqualZeroAndOne(arr, n));
	   }
	 }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
      HashMap<Integer,Integer>hm=new HashMap<>();
      hm.put(0,1);
      int sum=0;
      int ans=0;
     for(int val:arr){
         if(val==0)
         sum+=-1;
         else
         sum+=1;
     
          if(hm.containsKey(sum))
        {  ans+=hm.get(sum);
          hm.put(sum,hm.get(sum)+1);
        }
        else
        {
            hm.put(sum,1);
        }
      }return ans;
    }
}


