class Solution {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              HashSet<Integer> topleft = new HashSet<>();
             HashSet<Integer> bottomright = new HashSet<>();
                ans[i][j] = Math.abs(Topleft(grid, i, j, topleft) - Bottomright(grid, i, j, bottomright));
            }
        }
        return ans;

    }
   public int Topleft(int [][]grid,int r,int c,HashSet<Integer>hs) {
       r--;c--;
       if(r<0 ||c<0|| r>=grid.length|| c>=grid[0].length)
           return hs.size();
       hs.add(grid[r][c]);
       return Topleft(grid,r,c,hs);
   }
 public int Bottomright(int[][] grid, int r, int c, HashSet<Integer>hs) {
        r++;
        c++;
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) 
            return hs.size();
        hs.add(grid[r][c]);
        return Bottomright(grid, r, c, hs);
    }
}