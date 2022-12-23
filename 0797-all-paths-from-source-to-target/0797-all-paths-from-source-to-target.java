class Solution {

    public void dfs(int src,int des,boolean []vis,int[][] graph,List<Integer>path,List<List<Integer>>paths){
       if(vis[src]==true)
           return;
        //marked the path for which we are traversing
      vis[src]=true;
        path.add(src);
        if(src==des){
             paths.add(new ArrayList<>(path));
              // paths.add((path));
        }
      else{ 
        for(int nbr:graph[src]){
            dfs(nbr,des,vis,graph,path,paths);
        }}
        
        //to unmarked delete the path whichwe have traversed 
        vis[src]=false;
        path.remove(path.size()-1);
    }
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
      List<Integer>path=new ArrayList<>();
        List<List<Integer>>paths=new ArrayList<>();
        boolean vis[]=new boolean[graph.length];
        dfs(0,graph.length-1,vis,graph,path,paths);
        return paths;
    }
}