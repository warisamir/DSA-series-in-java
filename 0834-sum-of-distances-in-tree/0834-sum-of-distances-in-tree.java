class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        //to optimise the space we are creating an array of list;// instead of list of list 
       final ArrayList<Integer>[]ls=new ArrayList[n];
        //to store the count of distance from each node we have build an array for each node distance and filled with 1;
       final int ct[]=new int[n];
        Arrays.fill(ct,1);
       final int res[]=new int[n];
        for(int i=0;i<ls.length;i++){
            ls[i]=new ArrayList<>();
        }
        for(int v[]:edges){
            ls[v[0]].add(v[1]);
            ls[v[1]].add(v[0]);
        }
        helper(0,-1,ls,ct,res);
        helper2(0,-1,ls,ct,res,n);
        return res;
    }
    private void helper(int node,int parent,ArrayList<Integer>[]ls,int []ct,int res[]){
        for(int child:ls[node]){
            if(child!=parent){
                helper(child,node,ls,ct,res);
                ct[node]+=ct[child];
                res[node]+=res[child]+ct[child];
            }
        }
    }
    private void helper2(int node,int parent,ArrayList<Integer>[]ls,int []ct,int res[],int n){
        for(int child:ls[node]){
            if(child!=parent){
                res[child]=res[node]+(n-ct[child])-ct[child];
                helper2(child,node,ls,ct,res,n);
            }
        }
    }
}