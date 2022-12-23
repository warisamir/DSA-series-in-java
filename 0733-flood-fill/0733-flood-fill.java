class Solution {
    public void dfs(int[][]image,int sr,int sc,int newclr,int oldclr){
        if(sr<0 ||sc<0 || sr>=image.length || sc>=image[0].length)
            return ;
        if(image[sr][sc]!=oldclr)
            return;
        image[sr][sc]=newclr;
        dfs(image,sr+1,sc,newclr,oldclr);
        dfs(image,sr-1,sc,newclr,oldclr);
        dfs(image,sr,sc+1,newclr,oldclr);
        dfs(image,sr,sc-1,newclr,oldclr);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)return image;
        dfs(image,sr,sc,color,image[sr][sc]);
      return image; 
    }
}