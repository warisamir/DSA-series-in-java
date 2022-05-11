import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(a<b){
          int tem=a;
          a=b;
          b=tem;
      }
          int n1=a;
          int n2=b;
          int j=0;
        while(a%b!=0)
        {
            int rem=a%b;
            a=b;
            b=rem;
            }
       int g=b;
       int lcm=(n1*n2)/g;
       System.out.println(g);
      System.out.println(lcm);
    }
    }
    
    