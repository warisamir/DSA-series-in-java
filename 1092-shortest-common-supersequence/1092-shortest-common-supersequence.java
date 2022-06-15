class Solution {
    public String shortestCommonSupersequence(String t1, String t2) {
        int n=t1.length();
        int m=t2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++)
               if(i==0 ||j==0) dp[i][j]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(t1.charAt(i-1)==t2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        int i=n,j=m;
        StringBuilder sb=new StringBuilder();
        while(i>0 && j>0){
            if(t1.charAt(i-1)==t2.charAt(j-1)){
                sb.append(t1.charAt(i-1));
            j--;i--;
            }
            else {
                if(dp[i][j-1]<dp[i-1][j])
                {     sb.append(t1.charAt(i-1));
                i--;
            }
            else{
                sb.append(t2.charAt(j-1));
                j--;
            }
        }
        }
            while(i>0){
                sb.append(t1.charAt(i-1));
                i--;
            }
            while(j>0){
                sb.append(t2.charAt(j-1));
                j--;
            }
            
    return sb.reverse().toString();
    }
}