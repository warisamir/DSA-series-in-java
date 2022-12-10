class Solution {
    public boolean wordBreak(String s, List<String> b) {
        HashSet<String>hs=new HashSet<>();
        for(String s1:b){
            hs.add(s1);
        }
        boolean dp[]=new boolean[s.length()];
        for(int i=0;i<dp.length;i++){
            if(hs.contains(s.substring(0,i+1)))
                dp[i]=true;
            else{
                for(int j=0;j<i;j++)
                {
                    if(dp[j]==true && hs.contains(s.substring(j+1,i+1)))
                        dp[i]=true;
                }
            }
        }
        return dp[dp.length-1];
    }
}