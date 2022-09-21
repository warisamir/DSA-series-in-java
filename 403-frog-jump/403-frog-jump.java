class Solution {
    boolean dp[][];
    public boolean canCross(int[] arr) {
        if(arr[1]!=1)
            return false;
        int n=arr.length;
       dp=new boolean[n][n];
        return helper(arr,0,1);
    }
    public boolean helper(int []arr,int li,int ci){
        if(ci==arr.length-1)
            return true;
        if(dp[li][ci])return false;
        int lastj=arr[ci]-arr[li];
        int nexti=ci+1;
        while(nexti<arr.length && arr[nexti]<=arr[ci]+lastj+1){
            int nextj=arr[nexti]-arr[ci];
            int jump=nextj-lastj;
            if(jump>=-1 && jump <=1){
                if(helper(arr,ci,nexti))
                    return true;
            }
            nexti++;
        }
        dp[li][ci]=true;
        return false;
    }
}