class Solution {
    public boolean searchMatrix(int[][] mt, int target) {
       for(int i=0;i<mt.length;i++){
           for(int j=0;j<mt[0].length;j++){
               if(mt[i][j]==target)
                   return true;
           }
       } 
        return false;
    }
}