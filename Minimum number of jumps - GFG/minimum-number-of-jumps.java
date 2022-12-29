// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}
// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
      // your code here
      int n=arr.length;
       if(arr[0]==0 && n>1)return -1;
       if(n==1)return 0;
      int far=0,jmp=0,curr=0;
      for(int i=0;i<n-1;i++){
          far=Math.max(i+arr[i],far);
          if(curr==i)
          {jmp++;curr=far;
          }
      }
      if(curr<n-1)
      return -1;
      return jmp;
    }

}