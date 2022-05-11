import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int fac=2;fac<=(n);fac++)
  {
while(n%fac==0){
    n=n/fac;
    System.out.print(fac+" ");
}
  }
 }
}