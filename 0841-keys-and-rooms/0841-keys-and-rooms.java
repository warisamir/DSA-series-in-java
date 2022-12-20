class Solution {
 static boolean[] visited;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];
        visited[0] = true;
        dfs(rooms,0);
        for (boolean i: visited){
            if(!i) return false;
        }
        return true;
    }
    public void dfs(List<List<Integer>> ls, int key){
        for(int i: ls.get(key)){
            if(!visited[i]){
                visited[i] = true;
                dfs(ls,i);
            }
        }
}
}