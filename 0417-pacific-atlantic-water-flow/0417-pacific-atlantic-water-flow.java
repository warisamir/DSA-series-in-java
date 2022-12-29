class Solution {
    
    
    int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
    public void DFS(int r,int c,int [][]heights,boolean [][]vis){
        // if()return
        if(vis[r][c]==true)return ;
        vis[r][c]=true;
        for(int d=0;d<4;d++){
            int nr=r+dir[d][0];
            int nc=c+dir[d][1];
            if(nr<0 || nc<0 ||nr>=heights.length ||nc>= heights[r].length)
                continue;
            if(heights[nr][nc]>=heights[r][c])
                DFS(nr,nc,heights,vis);
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n=heights.length,m=heights[0].length;
        boolean [][]vis=new boolean[n][m];
        //combined time complexity O(n2)
        for(int i=0;i<m;i++) //top wall 
             DFS(0,i,heights,vis);
         for(int i=0;i<n;i++)  //left wall
             DFS(i,0,heights,vis);
            
        boolean avis[][]=new boolean[n][m];
      // //combined time complexity O(n2)
        for(int i=0;i<m;i++) //bottom
             DFS(n-1,i,heights, avis); //wall 
         for(int i=0;i<n;i++)  //right wall
             DFS(i,m-1,heights,avis);
        
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==true && avis[i][j]==true)
                { List<Integer>pt=new ArrayList<>();
                   pt.add(i);pt.add(j);
                res.add(pt);
            }
        }
        }
        return res;//hence time complexity of total time is 2O(n2)
        }
}