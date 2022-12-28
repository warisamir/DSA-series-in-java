//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
         public int countIsland(int [][]mat){
         int n=mat.length;
        int m=mat[0].length;
        int ct=0;
        int [][] vis=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1 && vis[i][j]==0){
                    ct++;
                    dfs(vis,mat,i,j,n,m);
                }
            }
        }
        return ct;
    }
    public void dfs(int [][] vis,int [][] mat,int i,int j,int n,int m){
        if(i<0||i>=n||j<0||j>=m||vis[i][j]==1||mat[i][j]==0) return;
        vis[i][j]=1;
        dfs(vis,mat,i+1,j,n,m);
        dfs(vis,mat,i,j+1,n,m);
        dfs(vis,mat,i-1,j,n,m);
        dfs(vis,mat,i,j-1,n,m);
    }
    public List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
        int [][] mat = new int [rows][cols];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<operators.length;i++){
            mat[operators[i][0]][operators[i][1]]=1;
            ans.add(countIsland(mat));
        }
        return ans;
    }
    
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int  k= sc.nextInt();
            int[][] a = new int[k][2];
            for(int i=0;i<k;i++){
            
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            List<Integer> ans = obj.numOfIslands(n,m,a);
           
            for(int i:ans){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends