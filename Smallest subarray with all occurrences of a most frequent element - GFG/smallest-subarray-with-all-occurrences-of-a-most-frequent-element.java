//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution{
    class Pair{
        int fre;
        int fi;
        int li;
        Pair(int fre,int fi,int li){
            this.fre=fre;
            this.fi=fi;
            this.li=li;
        }
    }
  
    ArrayList<Integer> smallestSubsegment(int arr[], int n)
    {
        // Complete the functionMap
        HashMap<Integer,Pair>hm=new HashMap<>();
        int mfi=arr[0];
        int mf=1;
        int si=0;
        int mflen=1;
        hm.put(arr[0],new Pair(1,0,0));
        for(int i=1;i<arr.length;i++){
            int val=arr[i];
            if(hm.containsKey(val))
            {
            Pair p=hm.get(val);
            p.fre++;
            p.li=i;
            int len=i-p.fi+1;
            if(p.fre>mf){
                mfi=val;
                mf=p.fre;
                si=p.fi;
                mflen=len;
            }
            else if(p.fre==mf && len<mflen){
                mfi=val;
                mf=p.fre;
                si=p.fi;
                mflen=len;
            }
            else if(p.fre==mf && len==mflen && p.fi<si)
            {
              mfi=val;
                mf=p.fre;
                si=p.fi;
                mflen=len;   
            }
            }
            else
            hm.put(val,new Pair(1,i,i));
        }
        int en=mflen+si-1;
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=si;i<=en;i++)
        ls.add(arr[i]);
        return ls;
    }
  
    
}


//{ Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    res = obj.smallestSubsegment(arr, sizeOfArray);
		    for(int i:res)
		        System.out.print(i + " ");
		    System.out.println();
		}
	}
}


            


// } Driver Code Ends