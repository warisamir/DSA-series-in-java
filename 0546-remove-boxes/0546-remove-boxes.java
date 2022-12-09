class Solution {
    public int removeBoxes(int[] boxes) {
        int n=boxes.length;
        int dp[][][]=new int[n][n][n];
         return helper(boxes,0,n-1,0,dp);
    }
    public int helper(int []box,int i,int j,int k,int [][][]dp){
        if(i>j)
            return 0;
        if(dp[i][j][k]!=0)return dp[i][j][k];
        int res=(k+1)*(k+1)+helper(box,i+1,j,0,dp);
        for(int m=i+1;m<=j;m++){
             if(box[m]==box[i])
             {
                int fact =helper(box,i+1,m-1,0,dp)+helper(box,m,j,k+1,dp);
                 res=Math.max(res,fact);
             }
        }
        dp[i][j][k]=res;
        return res;
    }
}