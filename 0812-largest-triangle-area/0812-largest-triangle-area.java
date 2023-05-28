class Solution {
    public double largestTriangleArea(int[][] arr) {
        double area=0.0;
        for(int k=0;k<arr.length;k++){
        for(int i=k+1;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
             area=Math.max(area,getarea(arr[k],arr[i],arr[j]));
            }
        }
        }
        return area;
    }
   public double getarea(int[] p1, int[] p2, int[] p3) {
    return 0.5 * Math.abs(p1[0]*(p2[1]-p3[1]) + p2[0]*(p3[1]-p1[1]) + p3[0]*(p1[1]-p2[1]));
}
}