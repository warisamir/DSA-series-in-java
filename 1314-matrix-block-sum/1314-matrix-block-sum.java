class Solution {
    public int[][] matrixBlockSum(int[][] arr, int k) {
        int r=arr.length;
        int c=arr[0].length;
        int dp[][]=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                dp[i][j]=res(arr,r,c,i,j,k);
        
        
        return dp;
    }
    public static int res(int [][]arr,int r,int c,int i,int j,int k){
      int sum=0;
        for(int a=0;a<r;a++)
            for(int b=0;b<c;b++)
               if((i-k<=a && a<=i+k) &&(j-k<=b && b<=j+k))
                   sum+=arr[a][b];
        
        
        return sum;
    }
}