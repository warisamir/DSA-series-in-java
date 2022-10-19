class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>hm=new HashMap<>();
        for(String w:words){
            hm.put(w,hm.getOrDefault(w,0)+1);
        }
        List<String> ls=new ArrayList<>(hm.keySet());
        Collections.sort(ls,(a,b)->{ 
            return hm.get(a).equals(hm.get(b))?     a.compareTo(b):hm.get(b)-hm.get(a);
        });
            return ls.subList(0,k);
    }
}