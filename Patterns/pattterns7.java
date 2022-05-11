1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Constraints
1 <= n <= 100

Format
Input
A number n

Output
pat71

Example
Sample Input

5

Sample Output
*	
	*	
		*	
			*	
				*
        
  
  ///code
  
  import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
          int n=scn.nextInt();
        // write ur code here
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
               if(i==j)
               System.out.print("*");
               else
               System.out.print("\t");
           }
           System.out.println();
       }
    }
}
