Get Kpc
Easy

1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
2. The following list is the key to characters map :
    0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.                 

Constraints
0 <= str.length <= 10
str contains numbers only

Format
Input
A string str

Output
Contents of the arraylist containing words as shown in sample output

Example
Sample Input

78

Sample Output
[tv, tw, tx, uv, uw, ux]

//
import java.io.*;
import java.util.*;

public class Main {
static String[] d2ch={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in); 
 String s=sc.next();
ArrayList <String> a=getKPC(0,s);
System.out.println(a);
    }

    public static ArrayList<String> getKPC(int indx,String str) {
       if(indx==str.length()){
           ArrayList<String> bs=new ArrayList<>();
           bs.add("");
           return bs;
       }
       ArrayList <String> smlan=getKPC(indx+1,str);
       ArrayList <String> an=new ArrayList<>();
       for(Character let:d2ch[str.charAt(indx)-'0'].toCharArray()){
          for(String str2:smlan){
              an.add(let+str2);
          }
       }
       return an;

    }

}
