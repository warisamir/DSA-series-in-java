Get Subsequence
Easy

1. You are given a string str. 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str. Use sample input and output to take idea about subsequences. Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.


Constraints
0 <= str.length <= 20


Format
Input
A string str


Output
Contents of the arraylist containing subsequences as shown in sample output


Example
Sample Input

abc

Sample Output
[, c, b, bc, a, ac, ab, abc]

//
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
//ArrayList <String>subset=gss(0,s);
ArrayList <String> subset=gss(s);
System.out.println(subset);
    }

    //  public static ArrayList<String> gss(int ind,String str) {
    //   if(ind==str.length()){
    //         ArrayList <String> base= new ArrayList<>();
    //       base.add("");
    //       return base;  
    //     }
    //     ArrayList <String> sml=gss(ind+1,str);
    //     ArrayList <String> ans=new ArrayList<>();
    //     for (String smlsb: sml){
    //         ans.add(smlsb);
    //     }
    //     for(String smlsb:sml){
    //         ans.add(str.charAt(ind)+smlsb);
    //     }
    //     return ans;
    // }
 public static ArrayList<String> gss(String str) {
        if(str.length()==0)
     { ArrayList <String>base= new ArrayList<>();
      base.add("");
      return base;
     }
      char ch=str.charAt(0);
      String s=str.substring(1);
      ArrayList <String> res=gss(s);
      ArrayList <String> mres=new ArrayList<>();
      for(String rstr:res){
          mres.add(""+rstr);
      }
      for(String rstr:res){
          mres.add(ch+rstr);
      }
      return mres;
 }
}
