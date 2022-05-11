Subsets Of Array
Easy

1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to print all subsets of arr. Each subset should be
on separate line. For more clarity check out sample input and output.

Constraints
1 <= n <= 10
0 <= n1, n2, .. n elements <= 10^3

Format
Input
A number n
n1
n2
.. n number of elements

Output
[Tab separated elements of subset]
..
All subsets

Example
Sample Input

3
10
20
30

Sample Output
-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	
10	20	30

//
  import java.io.*;
import java.util.*;

public class Main {
  public static int dectobin(int n) {
    int re = 0;
    int mul = 1;
    while (n > 0) {
      int b = n / 2;
      int res = n % 2;
      re += res * mul;
      n = b;
      mul *= 10;
    }
    return re;
  }
  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s[] = new int[n];
    for (int i = 0; i < n; i++) {
      s[i] = sc.nextInt();
    }
    for (int dec = 0; dec < ((int)Math.pow(2, n)); dec++) {
      int b = dectobin(dec);

      int p = (int)Math.pow(10, n - 1);
      for (int j = 0; j < n; j++)
      {
        int bit = (b / p) % 10;
        if (bit == 1) {
          System.out.print(s[j] + "	");
        } else
        { System.out.print("-	");
        }
        
        p /= 10;
      }
      System.out.println();
}
    }
  }
