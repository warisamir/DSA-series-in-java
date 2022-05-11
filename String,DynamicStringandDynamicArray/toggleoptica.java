Toggle Optica Document
Easy

1. There is an agreement document for JSCOP optica but by mistake, the case of every character in the string of document is a toggle so you need to correct it.

2. You are given a string of the document that contains only lowercase and uppercase alphabets. 

3. You have to toggle the case of every character of the given string.






Constraints
1 <= length of string <= 1000


Format
Input
A String


Output
A String


Example
Sample Input

pepCODinG

Sample Output
PEPcodINg
//
//

import java.io.*;
import java.util.*;

public class Main {


public static String solution(String str){
		// write your code here
              String s="";
              for(int i=0;i<str.length();i++){
                  char ch=str.charAt(i);
                  if(ch>=97 && ch<=122)
                s=s+(char)(ch-32);
                  else
                s=s+(char)(ch+32);
              }
		return s;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
