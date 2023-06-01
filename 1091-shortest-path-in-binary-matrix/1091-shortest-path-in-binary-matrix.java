class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
         int m = grid.length;
        int n= grid[0].length;

        // if first or last cell is 1, then there is no path
        if(grid[0][0] == 1 || grid[m-1][n-1] == 1 ) return -1;

        boolean [][] visited = new boolean [m][n];

        // we need to check path only from source vertex
        //System.out.println("m::"+M+" n::"+N);
        return bfs(grid,0,0,m,n,visited);
    }

    private int bfs(int [][] grid, int i, int j, int m, int n,
     boolean [][] vis) {

         Queue<Pair> queue = new LinkedList<>();
         vis[i][j] = true;
      
         queue.add(new Pair(i,j,1));

         while(!queue.isEmpty()) {
            Pair p = queue.poll();
            if(p.i == m-1 && p.j == n-1) {
                return p.level;
            }

            int [] rowDir = {-1,-1,-1,0,0,1,1,1};
            int [] colDir = {-1,0,1,-1,1,-1,0,1};
            int nextLevel = p.level + 1;

            for(int k=0; k<8; k++) {
                int x = p.i + rowDir[k];
                int y = p.j + colDir[k];

                boolean isValidPos = isValidPos(x,y,grid);
                if(isValidPos && grid[x][y] == 0 && !vis[x][y]) {
                     vis[x][y] = true;
                    queue.add(new Pair(x,y,nextLevel));
                }
             }
         }

         return -1;
    }

    private boolean isValidPos(int x, int y, int[][] matrix) {
		return x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length;
	}

    static class Pair {
        int i;
        int j;
        int level;
        Pair(int i, int j, int level) {
            this.i = i;
            this.j = j;
            this.level = level;
        }
    }
}
  