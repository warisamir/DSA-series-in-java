class Solution {
    public int countHomogenous(String s) {
       int c=1;
        int m=1_000_000_007;
        int res=0;
        for(int i=0;i<s.length()-1;i++){
         if(s.charAt(i)==s.charAt(i+1))
         {
             c++;
          res=(res+c)%m;
        }else{
             c=1;
             res=(res+c)%m;
         }
        }
            return res+1;
    }
    
}