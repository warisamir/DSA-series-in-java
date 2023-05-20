class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Integer> variables = new HashMap<>();
        int k = 0;
        for(List<String> pair : equations){
            if(!variables.containsKey(pair.get(0))) variables.put(pair.get(0), k++);
            if(!variables.containsKey(pair.get(1))) variables.put(pair.get(1), k++);
        }
		
		// Create and Populate DSU.
        int N = variables.size();
        DSU dsu = new DSU(N);
        for(int i = 0; i < equations.size(); i++){
            dsu.union(variables.get(equations.get(i).get(0)), variables.get(equations.get(i).get(1)), values[i]);
        }
		
		// Answer queries.
        double[] ans = new double[queries.size()];
        for(int i =0; i < ans.length; i++){
            if(!variables.containsKey(queries.get(i).get(0)) || !variables.containsKey(queries.get(i).get(1))){
               ans[i] = -1;
            }else{
                Pair px = dsu.find(variables.get(queries.get(i).get(0)));
                Pair py = dsu.find(variables.get(queries.get(i).get(1)));
                if( px.parent != py.parent) ans[i] = -1;
                else ans[i] = (px.value/py.value);
            }    
        }
        return ans;
    }   
    }
    class DSU{
    int[] parent;
    double[] value;
    public DSU(int N){
        parent = new int[N];
        for(int i = 0; i < N; i++) parent[i] = i;
        value = new double[N];
        for(int i = 0; i < N; i++) value[i] = 1;
    }
    
    public Pair find(int x){
        if(parent[x] != x){
            Pair p = find(parent[x]);
            parent[x] = p.parent;
            value[x] = value[x] * p.value;
        }
        
        return new Pair(parent[x], value[x]);
    }
    
    public void union(int x, int y, double val){
        Pair px = find(x);
        Pair py = find(y);
        parent[px.parent] = py.parent;
        value[px.parent] = val * py.value / px.value;
    }
}

class Pair {
    int parent;
    double value;
    public Pair(int parent, double value){
        this.parent = parent;
        this.value = value;
    }
}
