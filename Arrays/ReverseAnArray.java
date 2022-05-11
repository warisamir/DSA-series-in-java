Reverse An Array
Easy

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to reverse the contents of array a.

Constraints
0 <= n < 10^4
-10^9 <= a[i] <= 10^9

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

5
1
2
3
4
5

Sample Output
5 4 3 2 1
  
  //
  import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a){
    // write your code here
    int l=a.length;
    int k=l-1;
    for(int i=0;i<(l/2);i++){
        int tem=a[i];
        a[i]=a[k];
        a[k]=tem;
        k--;
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    reverse(a);
    display(a);
 }

}
