class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n = quiet.length;
        if(quiet == null || n == 0) return new int[0];
        
        //initialize graph with adjacency list
       List<Integer>[] graph = new ArrayList[n];
        
         for(int node = 0; node < graph.length; node++)
            graph[node] = new ArrayList<>();
        
        //build graph: poor -> rich
        for(int i = 0; i < richer.length; i++){
            graph[richer[i][1]].add(richer[i][0]);
        }
        
        //answer array
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        
        
        for(int i = 0; i < n; i++){
            dfs(i,graph ,answer, quiet);
        }
        return answer;

    }
    
    
    public int dfs(int node,List<Integer>[]ls,int[] answer, int[] quiet){
        
        //filling result array with -1 initially will avoid repetion here
        if (answer[node] == -1){
            answer[node] = node;
            
            //depthwise check for every richer person if they are quieter
            for (int child: ls[node]){
                
                int curr = dfs(child,ls, answer, quiet);
                
                //quieter person
                if (quiet[curr] < quiet[answer[node]])
                    answer[node] = curr;
            }
        }
        return answer[node];
    }
}