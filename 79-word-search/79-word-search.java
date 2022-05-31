class Solution {
   class Trie{
        Trie[] c;
        boolean ends;
        Trie(){
            c = new Trie[58];
            ends = false;
        }
    }
    public boolean exist(char[][] board, String word) {
        if(board.length == 0) return false;
        Trie root = new Trie();
        Trie temp = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'A';
            if(root.c[idx]==null)
                root.c[idx]= new Trie();
            root = root.c[idx];
        }
        root.ends = true;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(solve(board,i,j,temp))
                    return true;
            }
        }
        return false;
    }
    
    public boolean solve(char[][] board,int i,int j,Trie root){
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]=='$') return false;
        int idx = board[i][j]-'A';
        if(root.c[idx]==null) return false;
        root = root.c[idx];
        if(root.ends) return true;
        char temp = board[i][j];
        board[i][j]='$';
        boolean flag = 
        solve(board,i+1,j,root)||
        solve(board,i-1,j,root)||
        solve(board,i,j+1,root)||
        solve(board,i,j-1,root) ;
        board[i][j]= temp;
        return flag;
    }
}
