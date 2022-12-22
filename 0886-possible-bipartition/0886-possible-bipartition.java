class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int color[]=new int[n+1];
        List<Integer>[]adj=new List[n+1];
        for(int i=0;i<=n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int v[]:dislikes){
            adj[v[0]].add(v[1]);
            adj[v[1]].add(v[0]);
        }
        
        for(int i=1;i<=n;i++){
            if(color[i]==0){
                LinkedList<Integer>ls=new LinkedList<>();
            ls.add(i); color[i]=1;
            while(ls.size()!=0){
                int top=ls.removeFirst();
                for(int nb:adj[top]){
                    if(color[nb]==color[top])
                        return false;
                    if(color[nb]==0)
                    {  color[nb]=-color[top];
                    ls.add(nb);
                    }
                }
            }
            }
        }
        return true;
    }
}