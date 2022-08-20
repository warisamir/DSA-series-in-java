class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int f1,int s2) {
        int m1=gets(nums,f1,s2);
        int m2=gets(nums,s2,f1);
        return Math.max(m1,m2);
    }
    public int gets(int []arr,int f1,int s2){
        int l[]=new int[arr.length];
        int sm=0;
        for(int i=0;i<arr.length;i++){
            sm+=arr[i];
            if(i==f1-1){
                l[i]=sm;
            }
            else if(i>=f1){
                sm-=arr[i-f1];
                l[i]=Math.max(l[i-1],sm);
            }
        } 
        int r[]=new int[arr.length];
       sm=0;
        for(int i=arr.length-1;i>=0;i--){
            sm+=arr[i];
            if(i==arr.length-s2)
                r[i]=sm;
            else if(i<arr.length-s2){
                sm-=arr[i+s2];
                r[i]=Math.max(r[i+1],sm);
            }
        }
        int mx=Integer.MIN_VALUE;
        for(int i=f1-1;i<arr.length-s2;i++){
            mx=Math.max(l[i]+r[i+1],mx);
        }
        return mx;
    }
}