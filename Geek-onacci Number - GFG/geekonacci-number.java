/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		 Scanner sc = new Scanner(System.in);
 int t = sc.nextInt();
 for(int i=0;i<t;i++){
     int a = sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     int n=sc.nextInt();
     int ans = geekonacci(n,a,b,c);
     System.out.println(ans);
 }
}
  public static int geekonacci(int n,int a,int b,int c){
      if(n==3)
      return c;
      if(n==2)
      return b;
      if(n==1)return a;
      else
      return geekonacci(n-1,a,b,c)+geekonacci(n-2,a,b,c)+geekonacci(n-3,a,b,c);
  }
	
}