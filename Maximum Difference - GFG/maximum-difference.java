//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			Solution ob = new Solution();
			System.out.println(ob.findMaxDiff(a,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int findMaxDiff(int a[], int n)
    {
	// Your code here	
	int sm[]=left(a);
	int ls[]=right(a);
	int max=0;
	for(int i=0;i<a.length;i++){
	    max=Math.max(max,Math.abs(ls[i]-sm[i]));
	}
	return max;
    }
    
public int[]right (int []a){	
	int sm[]=new int[a.length];
	Stack<Integer>st=new Stack<>();
	st.push(0);
	for(int i=1;i<a.length;i++){
	    while(st.size()>0 && a[st.peek()]>a[i])
	    {
	        sm[st.peek()]=a[i];
	        st.pop();
	    }
	 st.push(i);
	}
	return sm;
    }
    public int[]left (int []a){	
	int sm[]=new int[a.length];
	Stack<Integer>st=new Stack<>();
	st.push(a.length-1);
	for(int i=a.length-2;i>=0;i--){
	    while(st.size()>0 && a[st.peek()]>a[i])
	    {
	        sm[st.peek()]=a[i];
	        st.pop();
	    }
	 st.push(i);
	}
	return sm;
    }
}