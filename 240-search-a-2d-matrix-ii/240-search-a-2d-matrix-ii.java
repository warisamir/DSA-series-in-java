class Solution {
    public boolean searchMatrix(int[][] mt, int target) {
        for(int t=0;t<mt.length;t++){
            int i=0;
            int j=mt[0].length-1;
          while(i<=j){
              int mid=i+(j-i)/2;
              if(mt[t][mid]==target)
                  return true;
              else if(mt[t][mid]>target)
                  j=mid-1;
              else 
                  i=mid+1;
          }
        }
        return false;
    }
}