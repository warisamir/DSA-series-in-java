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
            String input[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            
            int mat1[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat1[i][j] = Integer.parseInt(input[j]);
                }
            }
            
            int mat2[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat2[i][j] = Integer.parseInt(input[j]);
                }
            }
            
        
            
            Solution ob = new Solution();
            System.out.println(ob.countPairs(mat1,mat2,n,x));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code herein
        int sz=mat2.length*mat2[0].length;
        int left=0;
        int righ=sz-1;
        int res=0;
        while(left<sz && righ>=0){
            int r1=left/mat1.length;
            int c1=left%mat1.length;
            int r2=righ/mat2.length;
            int c2=righ%mat2.length;
            if(mat1[r1][c1]+mat2[r2][c2]==x)
           { res++;
            left++;
            righ--;
           }
           else if(mat1[r1][c1]+mat2[r2][c2]>x){
               righ--;
           }
           else
           left++;
        }
        return res;
    }
}