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
        List<List<String>>[] sp=new List[s.length()];
        return helper(s,s.length()-1,sp);
    }
    public List<List<String>> helper(String s,int j,List []sp){
        if(j<0)
        {
             List<List<String>>ls=new ArrayList<>();
        List<String>bls=new ArrayList<>();
        ls.add(bls);
            return ls ;
        }
        if(sp[j]!=null)
            return (List<List<String>>)sp[j];
        
       List<List<String>>mres=new ArrayList<>();
        for(int i=j;i>=0;i--){
            if(dp[i][j]==true){
                String palin=s.substring(i,j+1);
                List<List<String>> res=helper(s,i-1,sp);
                for(List<String> lis:res){
                     ArrayList<String>mlis=new ArrayList<>(lis);
                    mlis.add(palin);
                    mres.add(mlis);
                }
            }
        }
         sp[j]=mres;
        return mres;
    }
}