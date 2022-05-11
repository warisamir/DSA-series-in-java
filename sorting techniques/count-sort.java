Count Sort
Easy

1. You are given an array(arr) of integers.
2. You have to sort the given array in increasing order using count sort.

Constraints
1 <= N <= 10000
-10^8 <= arr[i] <= 10^8

Format
Input
An Integer n 
arr1
arr2..
n integers

Output
Check the sample ouput and question video.

Example
Sample Input

5
7 
-2 
4 
1 
3

Sample Output
-2
1
3
4
7
  
  //
  import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
  int fre[]=new int [max-min+1];
  for(int i=0;i<arr.length;i++){
    int ind=arr[i]-min;
    fre[ind]++;
 }
int []pre=new int[max-min+1];
pre[0]=fre[0];
for(int i=1;i<fre.length;i++){
  pre[i]=pre[i-1]+fre[i];
};
int []res=new int[arr.length];
for(int i=arr.length-1;i>=0;i--){
  pre[arr[i]-min]--;
  int idx=pre[arr[i]-min];
  res[idx]=arr[i];
}
for(int i=0;i<arr.length;i++){
  arr[i]=res[i];
}


  // int c=0;
  // for(int i=0;i<fre.length;i++){
  //   for(int j=0;j<fre[i];j++){
  //     int val=i+min;
  //     arr[c]=val;
  //     c++;
  //   }
 // }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}
