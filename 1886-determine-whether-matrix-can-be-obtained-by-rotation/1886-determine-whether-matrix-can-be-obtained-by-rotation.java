class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
            if(same(mat, target)) return true;
        int[][] temp = new int [mat.length][mat.length];
        for(int i=0;i<3;i++){
          int[][] rotated = rotateby(mat, temp);
          temp=mat;
          mat=rotated;
          if(same(mat, target)) return true;

        }
        return false;
        
    }
    
    public int [][] rotateby(int[][] mat,int[][] temp) {
         for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                temp[j][mat.length-i-1]=mat[i][j];
            }
        }
        return temp;
        
    }
    
    public boolean same(int[][] mat, int[][] target) {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]!=target[i][j]) return false;
            }
        }
        return true;
    }
}