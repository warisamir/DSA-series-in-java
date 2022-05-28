class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int res[]=new int[k];
        int siz=arr.length;
        int m=(siz-1)/2;
        int med=arr[m];
        int id=0,l=0,r=siz-1;
        while(l<=r){
            if(arr[r]-med>=med-arr[l])
                res[id++]=arr[r--];
            else
                res[id++]=arr[l++];
            if(id==k)break;
        }
        return res;
        }
}