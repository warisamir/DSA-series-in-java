class Solution {
    public boolean isSelfCrossing(int[] arr) {
        boolean x=false,y=false;
        for(int i=2;i<arr.length;++i){
            int a=f(arr,i-2)-f(arr,i-4);
            int b=f(arr,i-2);
        if(x && arr[i]>=b)return true;
            if(y && arr[i]>=a && a>0) return true;
            if(arr[i]<a) x= true;
            else if(arr[i]<=b) y=true;
        }
        return false;
    }
    public int f(int arr[],int x){
       return (x<0)?0:arr[x];
    }
}