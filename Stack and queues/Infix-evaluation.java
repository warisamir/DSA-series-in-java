Infix Evaluation
Easy

1. You are given an infix expression.
2. You are required to evaluate and print it's value.

Constraints
1. Expression is balanced
2. The only operators used are +, -, *, /
3. Opening and closing brackets - () - are used to impact precedence of operations
4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
5. In two operators of equal precedence give preference to the one on left.
6. All operands are single digit numbers.

Format
Input
Input is managed for you

Output
Value of infix expression

Example
Sample Input

2 + 6 * 4 / 8 - 3

Sample Output
2

//
import java.io.*;
import java.util.*;

public class Main{
  public static int preced(char ch){
      if(ch=='/'|| ch=='*')  return 2;
      if(ch=='+'|| ch=='-') return 1;
      return 0;
  }
public static int performOp(int a,char op,int b){
    if(op=='+') 
    return a+b;
    else if(op=='-') 
    return a-b;
    else if(op=='*') 
    return a*b;
    else 
    return (a/b);
}
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack <Character> optr=new Stack<>();
    Stack <Integer> oprnd=new Stack<>();
    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        if(ch>='0' && ch <='9')
        oprnd.push(ch-'0');
        else if(ch=='(')
        optr.push(ch);
        else if(ch==')'){
        while(optr.peek()!='('){
            int b=oprnd.pop();
            int a=oprnd.pop();
            char op=optr.pop();
            oprnd.push(performOp(a,op,b));
        }
        optr.pop();
    }
    else if(ch=='+'|| ch=='-'|| ch=='*'||ch=='/'){
        while(optr.size()>0 && optr.peek()!='(' && preced(optr.peek())>=preced(ch)){
            int b=oprnd.pop();
            int a=oprnd.pop();
            char op=optr.pop();
            oprnd.push(performOp(a,op,b));
        }
        optr.push(ch);
    }
 }
 while(optr.size()>0){
     int b=oprnd.pop();
            int a=oprnd.pop();
            char op=optr.pop();
            oprnd.push(performOp(a,op,b));
        }
        System.out.println(oprnd.peek());
}

}
