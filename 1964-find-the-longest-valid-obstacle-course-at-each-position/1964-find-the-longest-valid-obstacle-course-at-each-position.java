class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] ar) {
     
      int n=ar.length, len=0;
        int res[]=new int[n];
        int lis[]=new int[n];
        for(int i=0; i<n; i++) {
            int l=0, r=len;
            while(l<r) {
                int m=l+(r-l)/2;
                if(lis[m]<=ar[i])
                    l=m+1;
                else
                    r=m;
            }
            lis[l]=ar[i];
            res[i]=l+1;
            if(len==l)
                len++;
        }
        return res;
    }
    }
