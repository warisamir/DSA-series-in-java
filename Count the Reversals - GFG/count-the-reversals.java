//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
      
        if(s.length()%2==1)
        return -1;
          // your code here   
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{')
            st.push(c);
            else if(st.size()==0)
            st.push(c);
            else if(st.peek()=='}')
            st.push(c);
            else 
            st.pop();
        }
        int op=0,cl=0;
        while(st.size()>0){
            if(st.peek()=='{')
                cl++;
            else
                op++;
               st.pop();
        }
        return (op+1)/2+(cl+1)/2;
    }
}