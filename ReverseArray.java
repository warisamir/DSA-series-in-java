Apackage xyz;

import java.util.Scanner;

public class ReveseanArray { 

	public static void main(String[] args) {
	/*	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []a=new int[n];
		System.out.println("Enter the element of array \n");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			int v= a[i];
		}
		int []b=new int[a.length];
		for(int j=0;j<a.length;j++) {
			int v=a[j];
			b[v]=j;
		}
		System.out.println("The reverse array is given below :>\n");
		for(int j=0;j<a.length;j++)
		{
			System.out.println(" "+b[j]);
		}
		

	*/
		Scanner s=new Scanner(System.in);
		   int n=s.nextInt();
		   int []a=new int[n];
		   for(int i=0;i<a.length;i++) {
		       a[i]=s.nextInt();

		   }
		   System.out.println("Enter the finding number");
		   int d=s.nextInt();
		   int l=0;
		   int h=a.length-1;
		   int mid=0;
		   while(l<=h) {
		       mid=(l+h)/2;
		       if(mid==0)
		        break;
		       else if(d<mid) {
		           h=mid-1;
		       }
		       else if (d>mid) { 
		           l=mid+1;
		           
		       } else { 
		           break;
		           
		       }
		   }
		   System.out.println(a[mid]+"\n"+a[mid-1]);
	
}

}
