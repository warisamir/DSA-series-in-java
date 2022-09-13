class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m=nums1.length;
        int n=nums2.length;
        int m1=(m+n+1)/2;
        int m2=(m+n+2)/2;
        int mid1=merge(nums1,nums2,m1,0,0);
        int mid2=merge(nums1,nums2,m2,0,0);
        return (mid1+mid2)/2.0;
    }
   public int merge(int nums1[],int []nums2,int k,int s1,int s2){
       if(s1>=nums1.length)
           return nums2[s2+k-1];
      else if(s2>=nums2.length)
           return nums1[s1+k-1];
       if(k==1)
          return Math.min(nums1[s1],nums2[s2]);
        int el1=Integer.MAX_VALUE;
        int el2=Integer.MAX_VALUE;
       if(s1+k/2-1<nums1.length)
       el1=nums1[s1+k/2-1];
       if(s2+k/2-1<nums2.length)
        el2=nums2[s2+k/2-1];
       if(el1<el2)
        return  merge(nums1,nums2,k-k/2,s1+k/2,s2);
       else
          return  merge(nums1,nums2,k-k/2,s1,s2+k/2);
       
   }
}
