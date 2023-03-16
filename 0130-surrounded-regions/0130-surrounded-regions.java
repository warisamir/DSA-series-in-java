class Solution {
    public void solve(char[][] board) {
        int n=board.length,m=board[0].length;
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<m;i++){
            dfs(board,0,i,vis);
            dfs(board,n-1,i,vis);
        }
        for(int j=0;j<n;j++){
            dfs(board,j,0,vis);
            dfs(board,j,m-1,vis);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==false && board[i][j]=='O')
                    board[i][j]='X';
            }
        }
    }
    public void dfs(char ar[][],int r,int c,boolean vis[][]){
        if(r<0 ||c<0 ||r>=ar.length|| c>=ar[0].length || vis[r][c]==true||ar[r][c]=='X')
            return;
        vis[r][c]=true;
        dfs(ar,r+1,c,vis);
         dfs(ar,r-1,c,vis);
         dfs(ar,r,c+1,vis);
         dfs(ar,r,c-1,vis);
    }
}