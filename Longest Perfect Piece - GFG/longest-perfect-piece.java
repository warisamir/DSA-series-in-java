//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.longestPerfectPiece(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int longestPerfectPiece(int[] arr, int N) {
        // code here
        SortedMap<Integer,Integer>hm=new TreeMap<>();
        int j=0;
        int win=0;
        for(int i=0;i<N;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            if(hm.lastKey()-hm.firstKey()<=1){
                int size=i-j+1;
                win=Math.max(win,size);
            }else{
                while(j<N && hm.lastKey()-hm.firstKey()>1)
                 {   hm.put(arr[j],hm.get(arr[j])-1);
                 if(hm.get(arr[j])==0)
                 hm.remove(arr[j]);
                 j++;
                }
            }
        }
        
        return win;
    }
}