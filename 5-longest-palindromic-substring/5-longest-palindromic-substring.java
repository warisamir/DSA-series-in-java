 class Solution {
      public String longestPalindrome(String s) {
       if(s==null ||s.length()<1) return "";
         
          int st=0,subs=0;
          for(int i=0;i<s.length();i++){
             int l1= expon(s,i,i);
              int l2=expon(s,i,i+1);
              int k=Math.max(l1,l2);
              if(k>subs-st){
                  st=i-(k-1)/2;
                  subs=i+k/2;
              }
          }
          return s.substring(st,subs+1);
     }
    private int expon(String s,int i,int j)
     {int L=i,R=j;
         while(L>=0 && R<s.length() && s.charAt(L)==s.charAt(R))
         {  L--;R++;
         }
        return R-L-1;
     }
 }