// { Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
       HashMap<String,Integer>Map=new HashMap<>();
       for(int i=0;i<arr.length;i++){
           Map.put(arr[i],Map.getOrDefault(arr[i],0)+1);
       }
      
        int max=0;
       String name="";
       String ans[] = new String[2];
       for(Map.Entry<String, Integer> items: Map.entrySet()){
           if(items.getValue()>max){
               max = items.getValue();
               name=items.getKey();
           }
           if(max == items.getValue()){
               if(name.compareTo(items.getKey())>0){
                   name=items.getKey();
               }
           }
       }
       ans[0] = name;
       ans[1] = Integer.toString(max);
       return ans;
    }
       
       
        }


