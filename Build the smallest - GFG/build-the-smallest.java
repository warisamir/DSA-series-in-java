//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String str = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.buildLowestNumber(str,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String buildLowestNumber(String str, int k) {
        // code here
        Stack<Integer>st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<str.length();i++){
            int a=str.charAt(i)-'0';
            while(!st.isEmpty() && st.peek()>a && k>0){
                st.pop();
                k--;
            }
            st.push(a);
        }
        while(k-->0){
            st.pop();
        }
        while(!st.isEmpty() ){
            ans.append(st.pop());
        }
       String curr=ans.reverse().toString();
       int i=0;
       for(;i<curr.length();i++){
           if(curr.charAt(i)!='0')break;
       }
       if(i==ans.length()) return "0";
       return curr.substring(i);
    }
    }
