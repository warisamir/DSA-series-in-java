class Solution {
    public int hIndex(int[] arr) {
        int bu[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
        if(arr[i]>arr.length)
            bu[arr.length]++;
            else
                bu[arr[i]]++;
        }
        int ct=0;
        for(int i=bu.length-1;i>=0;i--){
            ct+=bu[i];
            if(ct>=i)
                return i;
        }
        return 0;
    }
}