class Solution { 
    boolean ip[][];
    public int minCut(String s) {
        if(s.length()<=1)
            return 0;
     Ispalindrome(s);
        int dp[]=new int[s.length()];
            dp[0]=0;
        dp[1]=s.charAt(0)==s.charAt(1)?0:1;
        for(int j=2;j<dp.length;j++){
            dp[j]=j;
            if(ip[0][j])
                dp[j]=0;
            else{
                for(int i=j;i>0;i--){
                    if(ip[i][j])
               dp[j]=Math.min(dp[j],dp[i-1]+1);
                }
            }
        }
        
        return dp[dp.length-1];
    }
    public void Ispalindrome(String s){
        ip=new boolean[s.length()][s.length()];
        for(int g=0;g<ip[0].length;g++){
            for(int j=g,i=0;j<ip[0].length;j++,i++){
              if(g==0)
                  ip[i][j]=true;
                else if(g==1)
                    ip[i][j]=s.charAt(i)==s.charAt(j);
                else
                    ip[i][j]=s.charAt(i)==s.charAt(j) && ip[i+1][j-1]==true;
            }           
    }
}
}