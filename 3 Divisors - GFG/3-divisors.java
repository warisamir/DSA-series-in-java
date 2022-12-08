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
        while(t-->0){
            int q = sc.nextInt();
            ArrayList<Long> query = new ArrayList<>();
            for(int i=0;i<q;i++){
                query.add(sc.nextLong());
            }
            Solution ob = new Solution();
                
            ArrayList<Integer> ans = ob.threeDivisors(query,q);
            for(int cnt : ans) {
                System.out.println(cnt);
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> threeDivisors(ArrayList<Long> ls, int q){
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
       for(Long l:ls){
           int res=0;
           for(int j=2;j*j<=l;j++){
               if(!primecheck(j))
               res++;
           }
           ans.add(res);
       }
       return ans;
    }
    static boolean primecheck(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
            return true;
        }
        return false;
    }
}