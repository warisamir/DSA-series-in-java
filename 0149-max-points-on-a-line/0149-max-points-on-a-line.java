class Solution {
    public int maxPoints(int[][] points) {
        int maxcor=0;
        for(int i=0;i<points.length;i++){
            
            HashMap<Double,Integer>pointsonline=new HashMap<>();
            for(int j=i+1;j<points.length;j++){
                Double m=0.0;
                if((points[i][0] - points[j][0])==0.0)
                    m=Double.MAX_VALUE;
                else{
                    m=(points[i][1]-points[j][1])/((double)(points[i][0]-points[j][0]));
                    if(m==-0.0)m=0.0;
                }
                pointsonline.put(m,pointsonline.getOrDefault(m,0)+1);
                maxcor=Math.max(maxcor,pointsonline.get(m));
            }
        }
        return maxcor+1;
    }
}