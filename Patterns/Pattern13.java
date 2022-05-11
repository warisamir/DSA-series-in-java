1. You are given a number n.
2. You've to create a pattern as shown in output format

Constraints
1 <= n <= 10

Format
Input
A number n

Output
pat131

Example
Sample Input

5

Sample Output
1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1

//
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
          int n=scn.nextInt();
          for(int i=0;i<n;i++){
              int vl=1;
           for(int j=0;j<=n;j++){
               if(vl==0)
               continue;
               System.out.print(vl+"\t");
               int val=vl*(i-j)/(j+1);
               vl=val;
           }
           System.out.println();
          }
        

    }
}
