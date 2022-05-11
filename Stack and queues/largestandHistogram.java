Largest Area Histogram
Hard

1. You are given a number n, representing the size of array a. 2. You are given n numbers, representing the height of bars in a bar chart. 3. You are required to find and print the area of largest rectangle in the histogram. e.g. for the array [6 2 5 4 5 1 6] -> 12


Constraints
0 <= n < 20 0 <= a[i] <= 10


Format
Input
Input is managed for you


Output
A number representing area of largest rectangle in histogram


Example
Sample Input

7
6
2
5
4
5
1
6

Sample Output
12

//
import java.io.*;
import java.util.*;

public class Main{
  public static int[] nsr(int []arr){
     int nse[]=new int [arr.length];
     Arrays.fill(nse,arr.length);
     Stack <Integer> stk= new Stack<>();
     for(int i=arr.length-1;i>=0;i--){
        while(stk.size()>0 && arr[i]<=arr[stk.peek()])
        {
           stk.pop();
        }
        if(stk.size()>0)
        nse[i]=stk.peek();
       stk.push(i);
     }
     return nse;
  }
  public static int []nsl(int arr[]){
     int nse[]=new int [arr.length];
     Arrays.fill(nse,-1);
     Stack <Integer> stk= new Stack<>();
     for(int i=0;i<arr.length;i++){
        while(stk.size()>0 && arr[i]<=arr[stk.peek()])
        {
           stk.pop();
        }
        if(stk.size()>0)
        nse[i]=stk.peek();
       stk.push(i);
     }
     return nse; 
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }
    
    int nsl[]=nsl(arr);
    int nsr[]=nsr(arr);
    int maxArea=0;
    for(int i=0;i<arr.length;i++){
       int currArea=(nsr[i]-nsl[i]-1)*arr[i];
    maxArea= Math.max(maxArea,currArea);
    }
    // code
    System.out.println(maxArea);
 }
}
