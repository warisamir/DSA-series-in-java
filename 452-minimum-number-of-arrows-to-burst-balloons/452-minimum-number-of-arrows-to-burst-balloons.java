class Solution {
    public int findMinArrowShots(int[][] pts) {
        Arrays.sort(pts,(a,b)->{
        if(a[0]>b[0])return 1;
            else if(a[0]==b[0]) return 0;
            else return -1;
        });
        int c=0;
        int ans=Integer.MAX_VALUE;
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