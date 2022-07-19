class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
       int min[]=new int[n];
        min[n-1]=arr[n-1];
        for(int i=arr.length-2;i>=0;i--){
            min[i]=Math.min(min[i+1],arr[i]);
        }
        int re=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            max=Math.max(max,arr[i]);
            if(max<=min[i+1])
                re++;
        }
        return re+1;
    }
}