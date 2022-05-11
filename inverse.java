import java.util.*;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   int ps=1,c=0;
   int r;
    while(n!=0){
      int b=n%10;
      int id=ps;
      int ip=b;
      c=c+(int)Math.pow(10,ip-1)*id;
       n=n/10;
       ps++;
    }
     System.out.println(c);
  }
} 
