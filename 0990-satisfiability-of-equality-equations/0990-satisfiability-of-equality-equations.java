class Solution {
   static class DSU{
        int par[];
        int rank[];
        DSU(int n){
            par=new int[n];
            rank=new int[n];
            Arrays.fill(par,-1);
            Arrays.fill(rank,-1);
        }
        public void union(int a ,int b){
            int pa=find(a);
            int pb=find(b);
            if(pa==pb)
                return;
            if(rank[pa]>rank[pb])
            { 
                par[pb]=pa;
                rank[pa]+=rank[pb];
            }
            else{
                par[pa]=pb;
                rank[pb]+=rank[pa];
            }
            // par[pb]=pa;
        }
        public int find(int a){
            if(par[a]==-1) return a;
           return par[a]=find(par[a]);
        }
}

    public boolean equationsPossible(String[] equation) {
       DSU set=new DSU(26);
        for(String eq:equation){
            int left=eq.charAt(0)-'a';
            int right=eq.charAt(3)-'a';
            
             if(eq.charAt(1)=='=')
                    set.union(left,right);
        }
    
          for(String eq:equation){
            int left=eq.charAt(0)-'a';
            int right=eq.charAt(3)-'a';
                if(eq.charAt(1)=='!' && set.find(left)==set.find(right))
                    return false;
        }
        return true;
    }
}