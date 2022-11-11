class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer>st=new Stack<>();
        int ct=0;
        int ct1=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='(' )
           {ct++;
            ct1++;
           }
          else if(s.charAt(i)==')')
           { ct--;
            ct1--;
           }
          else if(s.charAt(i)=='*')
          {  ct++;ct1--;}
           
           if(ct<0) return false;
           ct1=Math.max(ct1,0);
       }
       
        return ct1==0;
    }
}