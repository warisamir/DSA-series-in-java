1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Constraints
1 <= n <= 100
 Also, n is odd.

Format
Input
A number n

Output
pat91

Example
Sample Input

5

Sample Output
*				*	
	*		*		
		*			
	*		*		
*				*

//
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
           int n=scn.nextInt();
          for(int i=1;i<=n;i++){
              for(int j=1;j<=n;j++){
                  if(i==j || i+j==n+1)
                  System.out.print("*\t");
                  else
                  System.out.print("\t");
              }
            System.out.println();
          }
    }
}
