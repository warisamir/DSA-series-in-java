class Solution {
    List<List<String>>res;
    public List<List<String>> solveNQueens(int n) {
        res=new ArrayList<>();
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<int[]>queen=new ArrayList<>();
        dfs(board,0,queen);
        return res;
    }
    private void dfs(char [][]board,int r,List<int[]> queen ){
        if(queen.size()==board.length){
           List<String>rows=new ArrayList<>();
            for(char []row:board){
                rows.add(new String(row));
            }
            res.add(rows);
        }
        for(int c=0;c<board.length;c++){
            if(canAdd(r,c,queen)){
                board[r][c]='Q';
                queen.add(new int[]{r,c});
                dfs(board,r+1,queen);
                board[r][c]='.';
                queen.remove(queen.size()-1);
            }
        }
    }
private boolean canAdd(int r,int c,List<int []>queen){
    for(int []q:queen){
        int dx=Math.abs(r-q[0]);
        int dy=Math.abs(c-q[1]);
        if(dx==0 ||dy==0 ||dx==dy)return false;
    }
    return true;
}
}