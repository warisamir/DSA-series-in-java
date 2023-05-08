class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0,j,i;
        for(i=0;i<mat.length;i++){
            s += mat[i][i];
			j = mat.length-i-1;
			if(i != j) s += mat[i][j];
            
            
        }
    
        return s;
    }
}
