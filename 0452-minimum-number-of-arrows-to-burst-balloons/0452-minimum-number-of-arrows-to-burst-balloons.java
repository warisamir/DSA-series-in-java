class Solution {
    public int findMinArrowShots(int[][] pts) {
        Arrays.sort(pts,(a,b)->Integer.compare(a[1],b[1]));
        int c=0;
        int ans=pts[0][1];
      for(int []p:pts){
           if(p[0]>ans)
           {  c++;
          ans=p[1];
           }
          else
              ans=Math.min(ans,p[1]);
       }
    return c+1;
    }
}