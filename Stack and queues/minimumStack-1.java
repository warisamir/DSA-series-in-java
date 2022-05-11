Note -> The judge maynot be able to check if all your functions are O(1) in time, but that is what the expectation is.

Constraints
None

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

push 10
push 20
push 5
push 8
push 2
push 4
push 11
top
min
pop
top
min
pop
top
min
pop
top
min
pop
top
min
pop
top
min
pop
top
min
pop
quit

Sample Output
11
2
11
4
2
4
2
2
2
8
5
8
5
5
5
20
10
20
10
10
10

//
import java.io.*;
import java.util.*;

public class Main {

  public static class MinStack {
    Stack<Integer> allData;
    Stack<Integer> minData;

    public MinStack() {
      allData = new Stack<>();
      minData = new Stack<>();
      minData.push(Integer.MAX_VALUE);
    }


    int size() {
      return allData.size();
      // write your code here  
    }

    void push(int val) {
      allData.push(val);
      minData.push(Math.min(minData.peek(),val));
      // write your code here
    }

    int pop() {
      if(size()==0){
        return -1;
      }
      minData.pop();
      return allData.pop();
      // write your code here
    }

    int top() {
      if(size()==0){
        return -1;
      }
     
      return allData.peek();
      // write your code here
    }

    int min(){
      if(size()==0){
        return -1;
      }
     
      return minData.peek();
  	  // write your code here
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MinStack st = new MinStack();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      } else if(str.startsWith("min")){
        int val = st.min();
        if(val != -1){
          System.out.println(val);
        }
      }
      str = br.readLine();
    }
  }
}
