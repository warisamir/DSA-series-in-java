//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            String W = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.numberOfSubsequences(S,W));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int numberOfSubsequences(String s, String w){
        // code here
        ArrayList<Character>ls=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            ls.add(s.charAt(i));
        }
        int j=0,i=0,ct=0;
        while(i<ls.size()){
            if(ls.get(i)==w.charAt(j))
            {
                j++;
                ls.remove(i);
                if(j==w.length()){
                    i=0;j=0;ct++;
                }continue;
            }i++;
        }return ct;
    }
}