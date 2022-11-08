//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int arr[], int n)
    {
        // code here
        int xxory=0;
       for(int val:arr)
       xxory=xxory ^ val;
       int rmsb=xxory & (~xxory+1);
       int x=0;
           int y=0;
           
       for(int val:arr){
         if((val & rmsb)==0)
         x=x^val;
         else
         y=y^val;
       }
       if(x>y)
       return new int[] {x,y};
       return new int[] {y,x};
    }
}