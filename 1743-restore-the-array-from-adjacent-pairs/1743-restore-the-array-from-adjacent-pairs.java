class Solution {
    
    public int[] restoreArray(int[][] adj) {
        HashMap<Integer,List<Integer>>hm=new HashMap<>();
        for(int ad[]:adj){
            int u=ad[0],v=ad[1];
            hm.putIfAbsent(u,new ArrayList<>());
            hm.putIfAbsent(v,new ArrayList<>());
            hm.get(u).add(v);
            hm.get(v).add(u);
          }
      int st=-1;
        for(int k:hm.keySet()){
            if(hm.get(k).size()==1)
            { st=k;
            break;
            }
        }
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        dfs(st, hm, list, set);
        
        //convert list to array
        int []res=new int[adj.length+1];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        
        return res;
    }
     
    // fill all pairs
    public void dfs(int start,HashMap<Integer,List<Integer>> hm,List<Integer>ls, Set<Integer>hs){
        ls.add(start);
        hs.add(start);
        for(int nbr: hm.get(start)){
            if(hs.contains(nbr)==false){
                dfs(nbr, hm, ls, hs);
            }
        }
    }
}