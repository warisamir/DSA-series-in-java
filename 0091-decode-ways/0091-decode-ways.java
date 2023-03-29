class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        if(n==1)
        {
          if(s.charAt(0)=='0'){
             return 0; 
          }  
            else
               return 1;
        }
       int dp[]=new int[n+1];
        dp[n]=1;
        for(int id=n-1;id>=0;id--){
            if(s.charAt(id)=='0')
            {
            dp[id]=0;
            }
            else{
                int way1=dp[id+1];
                int way2=0;
                if(id<s.length()-1 && Integer.parseInt(s.substring(id,id+2))<=26)
                   way2=dp[id+2];
                dp[id]=way1+way2;
            }
        }
        return dp[0];
    }
}