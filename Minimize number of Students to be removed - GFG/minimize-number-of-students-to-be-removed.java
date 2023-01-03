//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] H = new int[N];
            
            for(int i=0; i<N; i++)
                H[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            out.println(ob.removeStudents(H,N));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public int removeStudents(int[] H, int N) {
        // code here
        ArrayList<Integer>ls=new ArrayList<>(N);
        ls.add(H[0]);
        int max=1;
        for(int i=1;i<N;i++){
            if(ls.get(ls.size()-1)<H[i])
            {
                ls.add(H[i]);
                max++;
            }
            else{
                int id=Collections.binarySearch(ls,H[i]);
                   if (id < 0) {
                    id = -(id + 1);
                }
                ls.set(id, H[i]);
            }
        }
        return N-max;
    }
};