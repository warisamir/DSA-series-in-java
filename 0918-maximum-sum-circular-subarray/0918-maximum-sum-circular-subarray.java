class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int mx=0;
        int min=0;
        int currmx=arr[0];
        int currmin=arr[0],res=0;
        for(int val:arr){
            mx=Math.max(mx+val,val);
            currmx=Math.max(mx,currmx);
            min=Math.min(min+val,val);
            currmin=Math.min(min,currmin);
            res+=val;
        }
        return currmx>0?Math.max(res-currmin,currmx):currmx;
    }
}