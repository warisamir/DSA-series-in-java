class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        ArrayList<Integer>ls=new ArrayList<>();
        if(edges.length==0)
        {ls.add(0);
            return ls;}
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[]=new int[n];
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][1]).add(edges[i][0]);
            adj.get(edges[i][0]).add(edges[i][1]);
            indegree[edges[i][1]]++;
            indegree[edges[i][0]]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==1)
                q.add(i);
        }
        while(!q.isEmpty()){
            ArrayList<Integer>ad=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                int u=q.poll();
                ad.add(u);
                for(int v:adj.get(u)){
                    if(--indegree[v]==1)
                        q.add(v);
                }
            }
            ls=ad;
        }
        return ls;
    }
}