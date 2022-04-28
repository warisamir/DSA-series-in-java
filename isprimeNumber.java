// Is A Number Prime
// Easy

// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

// Constraints
// 1 <= t <= 10000
// 2 <= n < 10^9

// Format
// Input
// A number t
// A number n
// A number n
// .. t number of times

// Output
// prime
// not prime
// not prime
// .. t number of times

// Example
// Sample Input

// 5
// 13
// 2
// 3
// 4
// 5

// Sample Output
// prime
// prime
// prime
// not prime
// prime



import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  
       // write ur code here
     int n=sc.nextInt();
     int k=0;
     for(int i=1;i<=n;i++){
        int j=sc.nextInt();
        k=0;
        for(int c=2;c<=Math.sqrt(j);c++){
            if(j%c==0){
                k=k+1;
                break;
            }}
            if(k==0)
            System.out.println("prime");
            else
            System.out.println("not prime");
        }
       }
   }
   



















