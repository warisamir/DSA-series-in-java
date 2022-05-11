Duplicate Brackets
Easy

1. You are given a string exp representing an expression. 2. Assume that the expression is balanced i.e. the opening and closing brackets match with each other. 3. But, some of the pair of brackets maybe extra/needless. 4. You are required to print true if you detect extra brackets and false otherwise. e.g.' ((a + b) + (c + d)) -> false (a + b) + ((c + d)) -> true


Constraints
0 <= str.length <= 100


Format
Input
A string str


Output
true or false


Example
Sample Input

(a + b) + ((c + d))

Sample Output
true

//
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner sc=new Scanner(System.in);
     String st=sc.nextLine();
     Stack <Character> stk=new Stack<>();
     for(int i=0;i<st.length();i++){
         char ch=st.charAt(i);
         if(ch==')'){
             if(stk.peek()=='('){
                 System.out.println("true");
             return ;
         }
         while(stk.peek()!='('){
             stk.pop();
         }
         stk.pop();
     }
       else 
      stk.push(ch);
     
    }
    System.out.println("false");
    return ;
}



}
