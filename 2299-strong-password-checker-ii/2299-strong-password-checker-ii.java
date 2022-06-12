class Solution {
    public boolean strongPasswordCheckerII(String s) {
      
    if(s.length()<8)
        return false;
        Boolean low=false;
        boolean upp=false;
        boolean dig=false;
        boolean sp=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i>0 && s.charAt(i)==s.charAt(i-1)){
                return false;
            }
            else if(ch>='a' && ch<='z')
                low=true;
            else if(ch>='A' && ch<='Z')
                upp=true;
            else if(ch>='0' && ch <='9')
                dig=true;
            else if(ch=='!' ||ch=='@' ||ch=='#' ||ch=='$' ||ch=='%' ||ch=='^' ||ch=='&' ||ch=='*' ||ch=='(' ||ch==')' ||ch=='-' ||ch=='+' )
                sp=true;
        }
        return low && upp&& dig && sp;
    }
}