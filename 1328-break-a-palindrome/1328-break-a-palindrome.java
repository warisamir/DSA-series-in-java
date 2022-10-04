class Solution {
    public String breakPalindrome(String s) {
        if(s.length()==1) return "";
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length()/2;i++){
         if(s.charAt(i)!='a')
         {   
             ch[i]='a';
            break;
        }
            else if(s.length()/2-1==i)
            {   
               ch[s.length()-1]='b';
        }
    }
    return new String(ch);
    }
}