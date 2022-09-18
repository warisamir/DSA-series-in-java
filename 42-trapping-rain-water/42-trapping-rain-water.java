
class Solution {
    public int trap(int[] arr) {
       int n=arr.length;
        int l=0,r=n-1;
      int v=0;
        int lt=0,rt=0;
        while(l<r){
            if(arr[l]<=arr[r])
            {
                if(arr[l]>=lt)
                  lt=arr[l];
               else
                   v+=lt-arr[l];
                l++;
            } 
            else{
                if(arr[r]>=rt)
                    rt=arr[r];
                else
                    v+=rt-arr[r];
                r--;
            }
        }
        return v;
    }
}