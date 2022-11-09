class Solution {
    public int[][] restoreMatrix(int[] rS, int[] cS) {
        int rs[][]=new int[rS.length][cS.length];
        for(int i=0;i<rS.length;i++){
            for(int j=0;j<cS.length;j++){
                rs[i][j]=Math.min(cS[j],rS[i]);
                rS[i]-=rs[i][j];
                cS[j]-=rs[i][j];
            }
        }
        return rs;
    }
}