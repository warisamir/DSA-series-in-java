class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int min[]=new int[n];
        min[n-1]=arr[n-1];
        int count=1;
        for(int i=arr.length-2;i>=0;i--){
            min[i]=Math.min(arr[i],min[i+1]);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            max=Math.max(arr[i],max);
            if(max<=min[i+1]){
                count++;
                
            }
        }
        return count;
    }
}