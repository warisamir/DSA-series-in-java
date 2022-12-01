class Solution {
    public long gridGame(int[][] grid) {
        if(grid[0].length==1)return 0;
        long j,x=0;
        int n=grid[0].length;
        long pref[][]=new long[2][n];
        pref[1][0]=grid[1][0];
        for(int i=1;i<n;i++){
            pref[0][i]=pref[0][i-1]+grid[0][i];
            pref[1][i]=pref[1][i-1]+grid[1][i];
        }
        long min=Long.MAX_VALUE;
        min=Math.min(pref[0][n-1]-pref[0][0],pref[1][n-2]);
        for(int i=1;i<n-1;i++){
            long cv=Math.max(pref[0][n-1]-pref[0][i],pref[1][i-1]);
            if(cv<min)
                min=cv;
    
        }
        return min;
    }
}