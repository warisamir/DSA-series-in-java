class Solution {
    public int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
        //boundaires for spiral traversal
        int left = 0, right = n-1, top = 0, bottom = n-1;
        
        int i=1;
        
        while(i<=n*n){
            // top row, left to right
            for(int c=left; c<=right && i<=n*n; c++){
                matrix[top][c] = i++;
            }
            top++;
            
            // right column, top to bottom
            for(int r=top; r<=bottom && i<=n*n; r++){
                matrix[r][right] = i++;
            }
            right--;
            
            // bottom row, right to left
            for(int c=right; c>=left && i<=n*n; c--){
                matrix[bottom][c] = i++;
            }
            bottom--;
            
            // left column, bottom to top
            for(int r=bottom; r>=top && i<=n*n; r--){
                matrix[r][left] = i++;
            }
            left++;
        }
        
        return matrix;
        
    
    }
}