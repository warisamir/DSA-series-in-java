//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer>ls=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        // code here 
        for(int i=0;i<k;i++){
       hm.put(A[i],hm.getOrDefault(A[i],0)+1);
        }
        int j=0;
        ls.add(hm.size());
        for(int i=k;i<n;i++){
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            if(hm.get(A[j])==1)
            hm.remove(A[j]);
            else
            hm.put(A[j],hm.getOrDefault(A[j],0)-1);
            ls.add(hm.size());
            j++;
        }
        return ls;
    }
    
}

