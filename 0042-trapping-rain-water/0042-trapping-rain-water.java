
class Solution {
    public int trap(int[] arr){
        int v=0;
        int n=arr.length;
        int l=0,r=n-1;
        int larea=0,rarea=0;
        while(l<r){
            if(arr[l]<=arr[r]){
                if(arr[l]>=larea){
                    larea=arr[l];
                }
                else
                    v+=larea-arr[l];
                l++;
            }
            else
            {
                if(arr[r]>=rarea){
                    rarea=arr[r];
                }
                else{
                    v+=rarea-arr[r];
                }
                r--;
            }
        }
        return v;
    }
}