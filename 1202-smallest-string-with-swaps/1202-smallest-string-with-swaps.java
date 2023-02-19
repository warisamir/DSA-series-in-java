class Solution {
       static class DSU {
        int[] parent;
        int[] rank;

        DSU(int n) {
            parent = new int[n];
            Arrays.fill(parent, -1);
            rank = new int[n];
            Arrays.fill(rank, 1);
        }

        public void union(int a, int b) {
            int pa = find(a);
            int pb = find(b);
            if (pa == pb)
                return;

            if (rank[pa] > rank[pb]) {
                parent[pb] = pa;
                rank[pa] += rank[pb];
            } else {
                parent[pa] = pb;
                rank[pb] += rank[pa];
            }
        }

        public int find(int a) {
            if (parent[a] == -1)
                return a;
            return parent[a] = find(parent[a]);
        }
    }
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        DSU set=new DSU(s.length());
        for(List<Integer>pair:pairs)
            set.union(pair.get(0),pair.get(1));//it will give DSU with random parent ;
        //make 2 hashmap for given character and its indices
        HashMap<Integer,ArrayList<Integer>>idx=new HashMap<>();
        HashMap<Integer,ArrayList<Character>>ch=new HashMap<>();
        //find the parent for the given indices
        for(int i=0;i<s.length();i++){
            int par=set.find(i);
          if(idx.containsKey(par)==false){
              idx.put(par,new ArrayList<>());
              ch.put(par,new ArrayList<>());
          }
            ch.get(par).add(s.charAt(i));
            idx.get(par).add(i);
        }
      
        StringBuilder sb=new StringBuilder(s);
        for(Integer par:idx.keySet()){
             Collections.sort(ch.get(par));
                for(int j=0;j<ch.get(par).size();j++){
                    int id=idx.get(par).get(j);
                    char chr=ch.get(par).get(j);
                    sb.setCharAt(id,chr);
                
            }
        }
        return sb.toString();
    }
}