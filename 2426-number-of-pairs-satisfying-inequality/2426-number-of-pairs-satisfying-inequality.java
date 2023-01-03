class Solution {
    long ans = 0;
    int dif;
    public long numberOfPairs(int[] nums1, int[] nums2, int diff) {
        dif = diff;
        int[] nums = new int[nums1.length];
        for(int i = 0; i < nums2.length; i++) {
            nums[i] = nums1[i]-nums2[i];
        }
        
        nums = mergeSort(nums);
        return ans;
    }
    
    public int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        
        return merge(left,right);
    }
    
    public int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length+right.length];
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                int id = bs(right, left[i]-dif);
                arr[idx] = left[i];
                i++;
                idx++;
                ans += right.length-id;
            } else {
                arr[idx] = right[j];
                j++;
                idx++;
            }
        }
        
        while(i < left.length) {
            int id = bs(right, left[i]-dif);
            arr[idx] = left[i];
            i++;
            idx++;
            ans += right.length-id;
        }
        
        while(j < right.length) {
            arr[idx] = right[j];
            j++;
            idx++;
        }
        
        return arr;
    }
    
    public int bs(int[] arr, int val) {
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end) {
            int mid = (start+end)/2;
            
            if(arr[mid] >= val) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        
        return start;
    }
}