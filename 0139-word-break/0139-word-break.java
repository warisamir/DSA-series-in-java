class Solution {
    public boolean wordBreak(String s, List<String> b) {
        HashSet<String>hs=new HashSet<>(b);
        
        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;
          
        for(int i =1;i<=s.length();i++){//~
            for(int j=0;j<i;j++){
                 // System.out.println(s.substring(j,i));
                if(dp[j] && hs.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }  
            }
        }
        return dp[s.length()];
       }
}