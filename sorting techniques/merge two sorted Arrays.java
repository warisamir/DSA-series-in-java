Merge Two Sorted Arrays
Easy

1. You are given two sorted arrays(a,b) of integers.
2. You have to merge them and form one sorted array.
3. You have to do it in linear time complexity.

Constraints
1 <= N <= 10^8
-10^9 <= a[i],b[i] <= 10^9

Format
Input
An Integer n 
a1
a2..n integers
An integer m
b1
b2..m integers

Output
Check the sample output and question video.

Example
Sample Input

4
-2 
5 
9 
11
3
4 
6 
8

Sample Output
-2
4
5
6
8
9
11
  //

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int  i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        printTargetSumSubsets(arr,0,"",t);
         
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos) {
        if(idx==arr.length){
          if(sos==0){
              System.out.println(set+".");
          }
          return ;
        }
        if(sos<0){
            return ;
        }



        printTargetSumSubsets(arr,idx+1,set+arr[idx]+", ",sos-arr[idx]);
        printTargetSumSubsets(arr,idx+1,set,sos);
    }

}
