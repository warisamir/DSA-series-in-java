// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
      HashMap<Character,Integer> m =new HashMap<>();
      int f=0,k,i;
      char ch='$';
      for(i=0;i<S.length();i++)
      {
          k=m.getOrDefault(S.charAt(i),0);
          m.put(S.charAt(i),k+1);
      }
      for(i=0;i<S.length();i++)
      {
          if(m.get(S.charAt(i))==1){
              f=1;
              break;
          }
      }
      if(f==1){
          return S.charAt(i);
      }
      else{
          return ch;
      }
   }
}

