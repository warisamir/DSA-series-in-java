//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.countWays(N, S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int countWays(int N, String S){
        
          StringBuilder sb1 = new StringBuilder();
       StringBuilder sb2 = new StringBuilder();
       
       for(int i=0;i<S.length();i++){
           if(i%2==0){
               sb1.append(S.charAt(i));
           } else {
               sb2.append(S.charAt(i));
           }
       }
       
       String str1 = sb1.toString();
       String str2 = sb2.toString();
       
       int n = str1.length();
       long[][] dpt = new long[n][n];
       long[][] dpf = new long[n][n];
   
       for (int g = 0; g < n; g++) {
         for (int i = 0, j = g; j < n; i++, j++) {
           if (g == 0) {
             char ch = str1.charAt(i);
             if (ch == 'T') {
               dpt[i][j] = 1;
               dpf[i][j] = 0;
             } else {
               dpt[i][j] = 0;
               dpf[i][j] = 1;
             }
           } else {
             for (int k = i; k < j; k++) {
               long lpt = dpt[i][k];
               long rpt = dpt[k + 1][j];
               long lpf = dpf[i][k];
               long rpf = dpf[k + 1][j];
               char ch2 = str2.charAt(k);
               if (ch2 == '&') {
                 dpt[i][j] += lpt * rpt;
                 dpf[i][j] += lpt * rpf + lpf * rpt + lpf * rpf;
               } else if (ch2 == '|') {
                 dpt[i][j] += lpt * rpt + lpt * rpf + lpf * rpt;
                 dpf[i][j] += lpf * rpf;
               } else {
                 dpt[i][j] += lpf * rpt + lpt * rpf;
                 dpf[i][j] += lpf * rpf + lpt * rpt;
               }
             }
           }
           dpt[i][j]=dpt[i][j]%1003;
           dpf[i][j]=dpf[i][j]%1003;
         }
       }
       return (int)dpt[0][n - 1]%1003;
   }
}