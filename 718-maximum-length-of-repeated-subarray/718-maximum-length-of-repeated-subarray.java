class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int t[][]=new int[n+1][m+1];
        int max=0;
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0)
                {      t[i][j]=0;
            }
            else if(nums1[i-1]==nums2[j-1]){
                t[i][j]=1+t[i-1][j-1];
                if(max<t[i][j])
                    max=t[i][j];
            }
            }
        }
        return max;
    }
}