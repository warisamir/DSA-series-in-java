//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    Arrays.sort(arr);
		    Complete obj = new Complete();
		    int ans = obj.maximizeSum(arr, sizeOfArray);
		    System.out.println(ans);
		}
	}
}




// } Driver Code Ends


//User function Template for Java



class Complete{
    
   
    // Function for finding maximum and value pair
    public static int maximizeSum (int arr[], int n) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        int s=0;
        for(int i=n-1;i>=0;i--){
            if(hm.get(arr[i])!=0)
            {
                s+=arr[i];
                hm.put(arr[i],hm.get(arr[i])-1);
                if(hm.getOrDefault(arr[i]-1,0)!=0)
                hm.put(arr[i]-1,hm.get(arr[i]-1)-1);
                
            }
        }
        return s;
    }
    
    
}


