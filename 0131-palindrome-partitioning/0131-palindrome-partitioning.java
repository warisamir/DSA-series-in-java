class Solution {  
    boolean dp[][];
  void IsPalindrone(String s){
        dp=new boolean[s.length()][s.length()];
        for(int g=0;g<dp[0].length;g++){
            for(int j=g,i=0;j<dp[0].length;j++,i++){
                if(g==0)
                    dp[i][j]=true;
                else if(g==1)
                    dp[i][j]=s.charAt(i)==s.charAt(j);
                else{
                    dp[i][j]=s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true; 
                }
            }
        }
    }
    public List<List<String>> partition(String s) {
        IsPalindrone(s);
        // List<List<String>>[] dp=new List[s.length()];
        return helper(s,s.length()-1);
    }
    public List<List<String>> helper(String s,int j){
        if(j<0)
        {
             List<List<String>>ls=new ArrayList<>();
        List<String>bls=new ArrayList<>();
        ls.add(bls);
            return ls ;
        }
        // if(dp[j]!=null)return (List<List<String>>)dp[j];
       List<List<String>>mres=new ArrayList<>();
        for(int i=j;i>=0;i--){
            if(dp[i][j]==true){
                String palin=s.substring(i,j+1);
                List<List<String>> res=helper(s,i-1);
                for(List<String> lis:res){
                    // ArrayList<String>mlis=new ArrayList<>(lis);
                    lis.add(palin);
                    mres.add(lis);
                }
            }
        }
        // dp[j]=mres;
        return mres;
    }
}