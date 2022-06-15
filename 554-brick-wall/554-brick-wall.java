class Solution {
    public int leastBricks(List<List<Integer>> wl) {
HashMap<Integer,Integer> hm=new HashMap<>();
       hm.put(0,0);
        int max=0;
       for(int i=0;i<wl.size();i++){
         int t=0;
           for(int j=0;j<wl.get(i).size()-1;j++){
               t+=wl.get(i).get(j);
               hm.put(t,hm.getOrDefault(t,0)+1);
           }
       }
              max=Collections.max(hm.values());
        return wl.size()-max;
    }
}