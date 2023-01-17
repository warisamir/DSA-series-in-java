class Solution {
    public int twoCitySchedCost(int[][] arr) {
        Arrays.sort(arr,(a,b)->(b[1]-b[0])-(a[1]-a[0]));
        int s=0;
        for(int i=0;i<arr.length/2;i++){
            s=s+arr[i][0];
            }
        for(int i=arr.length/2;i<arr.length;i++){
            s=s+arr[i][1];
            }
        return s;
    }
}