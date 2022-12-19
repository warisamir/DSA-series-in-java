//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.BalancedString(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static String BalancedString(int N) {
        // code here
        String st="abcdefghijklmnopqrstuvwxyz";
        String res="";
        int t=N/26;
        int sr=0,end=0;
        int n=N%26;
       while(t-->0){
           res+=st;
       }
      if(n%2==0) sr=n/2;
      else{
          if(check(N)) sr=(n+1)/2;
          else
          sr=(n-1)/2;
      }
      end=n-sr;
      return res+st.substring(0,sr)+st.substring(26-end);
    }
    
    public static boolean check(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n=n/10;
        }
        return s%2==0?true:false;
    }
}