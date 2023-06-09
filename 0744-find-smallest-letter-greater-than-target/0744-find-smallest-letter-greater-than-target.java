class Solution {
    public char nextGreatestLetter(char[] arr, char tr) {
        int s = 0;
        int end = arr.length - 1;
        while (s <= end) {
            int mid = s + (end - s)/2;
            if (tr < arr[mid])
                end = mid - 1;
            else 
             s=mid+1;
           
        
    }
         return arr[s%arr.length];
}
}