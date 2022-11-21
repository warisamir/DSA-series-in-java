//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.UniquePartitions(n);
            for(ArrayList<Integer>i: ans)
                for(int j: i)
                    System.out.print(j + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
        // Code here
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>res=new ArrayList<>();
        helper(n,n,ans,res);
        return ans;
    }
    void helper(int a,int b,ArrayList<ArrayList<Integer>>res,ArrayList<Integer>ls){
        if(a==0)
        {res.add(new ArrayList<>(ls));
        return ;}
        if(b<=0)
        return ;
        if(b<=a){
          ls.add(b);
          helper(a-b,b,res,ls);
          ls.remove(ls.size()-1);
        }
        helper(a,b-1,res,ls);
    }
}