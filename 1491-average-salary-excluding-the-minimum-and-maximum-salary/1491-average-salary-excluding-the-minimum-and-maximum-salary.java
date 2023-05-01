class Solution {
    public double average(int[] arr) {
        Arrays.sort(arr);
        int c=arr.length;
double sm=0;
        for(int k:arr){
            sm+=k;
        }
        sm=sm-arr[0]-arr[arr.length-1];
        sm=sm/(arr.length-2);
        
        return sm;
    }
}