class Solution {
    public int maximumScore(int a, int b, int c) {
        int res=0;
        int []arr={a,b,c};
        Arrays.sort(arr);
        if(arr[0]+arr[1]>=arr[2])
            res=arr[2]+(arr[0]+arr[1]-arr[2])/2;
        else
            res=arr[0]+arr[1];
        return res;
    }
}