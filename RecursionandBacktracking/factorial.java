Factorial

1. You are given a number n.
2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints
0 <= n <= 10

Format
Input
A number n

Output
factorial of n

Example
Sample Input

5

Sample Output
120

//
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=factorial(n);
        System.out.println(r);
    }

    public static int factorial(int n){
       int s=1;
       if(n==0 ||n==1)
        s=1;
       else{
       s=n*factorial(n-1);
    }
    return s;
    }

}
