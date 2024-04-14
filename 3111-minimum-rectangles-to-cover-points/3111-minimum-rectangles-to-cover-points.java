class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        Arrays.sort(points,(a,b)->a[0]-b[0]);
        int ans=0,last=-1;
        for(int a[]:points){
            if(a[0]>last)
            { ans++;
                last=a[0]+w;
            }
        }
        return ans;
    }
}