class Solution{
    public int[] findDiagonalOrder(int[][] mat) {
        
        int r = 0, c = 0, m = mat.length, n = mat[0].length, ar[] = new int[m * n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = mat[r][c];
            if ((r + c) % 2 == 0) { // moving up
                if      (c == n - 1) { r++; }
                else if (r == 0)     { c++; }
                else            { r--; c++; }
            } else {                // moving down
                if      (r == m - 1) { c++; }
                else if (c == 0)     { r++; }
                else            { r++; c--; }
        }
        }
    return ar;
    }
}