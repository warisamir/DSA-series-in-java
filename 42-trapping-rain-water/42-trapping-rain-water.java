class Solution {
    public int trap(int[] arr) {
       int n=arr.length;
        int j=0;
        int l[]=new int[arr.length];
        for(int i=0;i<n;i++){
           if(i==0) l[i]=arr[i];
            else
                l[i]=Math.max(l[i-1],arr[i]);
        }
        int rt[]=new int[arr.length];
        for(int i=n-1;i>=0;i--){
            if(i==n-1)
                rt[i]=arr[i];
            else
                rt[i]=Math.max(rt[i+1],arr[i]);
        }
        int v=0;
        for(int i=0;i<n;i++){
          v+=Math.min(rt[i],l[i])-arr[i];  
        }
        return v;
    }
}