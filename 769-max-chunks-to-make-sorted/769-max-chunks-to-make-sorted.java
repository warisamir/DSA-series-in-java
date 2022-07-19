class Solution {
    public int maxChunksToSorted(int[] arr) {
        int m=Integer.MIN_VALUE; 
        int ct=0;
        int n=arr.length;
        if(n==0)return 0;
        for(int i=0;i<n;i++){
            m=Math.max(arr[i],m);
            if(m==i)ct++;
        }
        return ct;
    }
}