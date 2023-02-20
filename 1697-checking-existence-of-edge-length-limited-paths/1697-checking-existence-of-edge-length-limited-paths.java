class Solution {
    static class DSU {
        int parent[];
        int rank[];
        DSU(int n){
            parent=new int[n];
            rank=new int[n];
            Arrays.fill(parent,-1);
            Arrays.fill(rank,1);
        }
        public void union(int a ,int b){
            a=find(a);
            b=find(b);
            if(a==b)return ;
            if(rank[a]>rank[b]){
                parent[b]=a;
                rank[a]+=rank[b];
            }
            else{
                parent[a]=b;
                rank[b]+=rank[a];
            }
        } 
        public int find(int a){
            if(parent[a]==-1)
                return a;
            return parent[a]=find(parent[a]);
        }
    }
    public static class Query implements Comparable<Query>{
        int id,a,b,thr;
        Query(int id,int a,int b ,int thr){
            this.id=id;
            this.a=a;
            this.b=b;
            this.thr=thr;
        }
        public int compareTo(Query other){
            return this.thr-other.thr;
        }
    }
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
   
        List<Query>ls=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            ls.add(new Query(i,queries[i][0],queries[i][1],queries[i][2]));
        }
        Collections.sort(ls);
        Arrays.sort(edgeList,(a,b)->a[2]-b[2]);
        DSU set=new DSU(n);
        boolean []res=new boolean[queries.length];
        int e=0;
        for(Query q:ls){
            while(e<edgeList.length && edgeList[e][2]<q.thr){
                set.union(edgeList[e][0],edgeList[e][1]);
                e++;
            }
            if(set.find(q.a)==set.find(q.b))
                res[q.id]=true;
        }
        return res;
    }
}