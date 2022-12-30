//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseWords(String s)
    {
        Stack<Character>st=new Stack<>();
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                
                while(!st.isEmpty()){
                res+=st.pop()  ;
                }res+=""+".";
            }
            else{
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
}