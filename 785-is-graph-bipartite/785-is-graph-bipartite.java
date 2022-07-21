class Solution {
    public boolean isBipartite(int[][] graph) {
        int visited[]=new int[graph.length];
        for(int v=0;v<graph.length;v++){
            //if vertices not visited then pass them to isbip traversal via dfs 
            if(visited[v]==0){
                boolean isbip=traverse(graph,visited,v);
               // boolean isbip=traverse(graph,visited,v,1);
                if(isbip==false)
                    return false;
            }
        }
        return true;
    }
    class Pair{
        int v;
        int color;
        Pair(int v,int color){
            this.v=v;
            this.color=color;
        }
    }
    //pass graph visted array for checking and vertices of graph
    public boolean traverse(int[][]graph,int[] visited,int v){
        ArrayDeque<Pair>q=new ArrayDeque<>();
        //adding a starting color
        q.add(new Pair(v,1));
        while(q.size()>0){
            Pair rem=q.remove();
            // *marked
            //if already visited then we compare both old color and new color is same or not 
           
            visited[rem.v]=rem.color;
            
            //here if neighbour are not visted then traverse them make them reverse color 
            for(int nbr: graph[rem.v]){
                if(visited[nbr]==0)
                    q.add(new Pair(nbr,rem.color*-1));
    else{
        int nc=visited[nbr];
        int oc=rem.color*-1;
        if(oc!=nc)return false;
        
    }
            }
        }
        return true;
    }
    // public boolean traverseDfS(int [][]graph,int []visited,int v,int color){
    //    //make the color visited start with 1  
    //     visited[v]=color;
    //     for(int nbr:graph[v]){
    //         if(visited[v]==0){
    //             //if neighbour are unvisited then check for nbr color with reverse color color 
    //           boolean isBip=  traverseDfS(graph,visited,nbr,color*-1);
    //             if(isBip==false)return false;
    //         }
    //         else{
    //             //if neighboru ar unvisited 
    //            int oc=visited[nbr];
    //             int nc=color*-1;//new colour is reverse of neighbour 
    //             if(nc!=oc)
    //                 return false;
    //         }
    //     }
    //     return true;
    // }
}