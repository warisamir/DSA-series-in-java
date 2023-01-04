//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntMatrix {
    public static int[][] input(BufferedReader br, int n, int m) throws IOException {
        int[][] mat = new int[n][];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for (int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int[][] intervals = IntMatrix.input(br, n, 3);

            Solution obj = new Solution();
            int res = obj.maximum_profit(n, intervals);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int maximum_profit(int n, int[][] ar) {
        // code here
        Arrays.sort(ar,(a,b)->{
          if(a[0]!=b[0])
          return a[0]-b[0];
          else return a[1]-b[1];
        });
        int dp[]=new int[ar.length];
        dp[0]=ar[0][2];
        for(int i=1;i<n;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(ar[j][1]<=ar[i][0])
                max=Math.max(dp[j],max);
            }
            dp[i]=max+ar[i][2];
        }
        int s=0;
       for(int i:dp)
       s=Math.max(i,s);
        return s;
    }
}
