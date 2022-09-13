class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0 , j=0 , k=0;
        double ans = 0.0;
        int narr[] = new int[nums1.length + nums2.length];
        
        while(nums1.length>i && nums2.length>j){
            if(nums1[i]<nums2[j])
                narr[k++]=nums1[i++];
            else
                narr[k++]=nums2[j++];
        }
        while(nums1.length>i)
            narr[k++]=nums1[i++];
        while(nums2.length>j)
            narr[k++]=nums2[j++];
        double ct=0;
        int med=narr.length/2;
        if(narr.length%2==0)
            ct=(narr[med]+narr[med-1])/2.0;
        else
            ct=narr[med];
        return ct;
    }
}
