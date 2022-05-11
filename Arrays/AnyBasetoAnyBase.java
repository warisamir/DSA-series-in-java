1. You are given a number n.
2. You are given a base b1. n is a number on base b.
3. You are given another base b2.
4. You are required to convert the number n of base b1 to a number in base b2.

Constraints
0 <= n <= 512
2 <= b1 <= 10
2 <= b2 <= 10

Format
Input
A number n
A base b1
A base b2

Output
A number of base b2 equal in value to n of base b1.

Example
Sample Input

111001
2
3

Sample Output
2010
///
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sB = scn.nextInt();
     int  dB= scn.nextInt();
     int k=ge(n,sB);
     int s=gb(k,dB);
     System.out.println(s);
   }   
    public static int ge(int r, int b){
      // write your code here
      int rem=0;
      int mul=1;
      while(r>0){
         int c=r%10;
         r/=10;
         rem+=(c*mul);
         mul*=b;
      }
      return rem;
   }
      public static int gb(int r, int b){
       // write code here
       int rem=0;
       int mul=1;
       while(r>0){
           int c= r%b;
           r/=b;
           rem+=(c*mul);
           mul*=10;
       }
return rem;
   }
  }
