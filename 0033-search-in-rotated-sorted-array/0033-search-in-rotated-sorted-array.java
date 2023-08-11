class Solution {
    public int search(int[] arr, int key) {
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)>>1;
            if(arr[mid]==key) return mid; 
           else if(arr[lo]<=arr[mid])
            {
                if(key>=arr[lo] && key<arr[mid])
                hi=mid-1;
            else 
            lo=mid+1;
            }
            else{
            if(arr[mid]<key && key<=arr[hi]){
                    lo=mid+1;
                }
                    else
                    hi=mid-1;
            }
        }
        return -1;
    }
    
}