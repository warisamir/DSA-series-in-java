class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<grid.length;i++){ 
           c+=search(grid,i);
        }
        return c;
    }
    public int search(int [][]arr,int i){
        int m=arr[0].length;
        int n=arr.length;
        int lo=0;
        int hi=m-1;
        while(hi-lo>1){
            int mid=(hi+lo)>>1;
            if(arr[i][mid]>=0)
                lo=mid+1;
            else
                hi=mid;
        }
        if(arr[i][lo]<0)
            return m-lo;
        else if(arr[i][hi]<0)
            return m-hi;
    return 0;
    }
}