class Solution {
    static class DSU{
        int parent[];
        int rank[];
        DSU(int n){
            parent=new int[n];
            rank=new int[n];
            Arrays.fill(parent,-1);
            Arrays.fill(rank,-1);
        }
            public void union(int a,int b){
                int pa=find(a);int pb=find(b);
                if(pa==pb)
                    return;
            if(rank[pa]>rank[pb]){
                parent[pb]=pa;
                rank[pa]+=rank[pb];
            }
                else{
                    parent[pa]=pb;
                    rank[pb]+=rank[pa];
                }
            }
        public int find(int a){
            if(parent[a]==-1)
                return a;
            return parent[a]=find(parent[a]);
        }
    }
    public boolean issimilar(String a,String b){
        int ct=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i))
                ct++;
        }
        if(ct<=2) return true;
        return false;
    }
    public int numSimilarGroups(String[] strs) {
        DSU set=new DSU(strs.length);
        for(int i=0;i<strs.length;i++)
            for(int j=i+1;j<strs.length;j++)
                if(issimilar(strs[i],strs[j])==true)
                    set.union(i,j);
        int com=0;
        for(int i=0;i<strs.length;i++)
            if(set.find(i)==i)
                com++;
        return com;
    }
}