class Solution {
    public int trap(int[] arr) {
        int s=0;
        int n=arr.length;
      int l[]=new int[arr.length];
        for(int i=0;i<n;i++){
            if(i==0) l[i]=arr[i];
            else
                l[i]=Math.max(l[i-1],arr[i]);
        }
        int r[]=new int[n];
        for(int i=n-1;i>=0;i--){
            if(i==n-1) r[i]=arr[i];
            else
                r[i]=Math.max(r[i+1],arr[i]);
        }
        int v=0;
        for(int i=0;i<n;i++){
          v+=Math.min(l[i],r[i])-arr[i];
        }
        return v;
    }
}