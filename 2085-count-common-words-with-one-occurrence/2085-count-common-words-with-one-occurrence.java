class Solution {
    public int countWords(String[] words1, String[] words2) {
      List<String> ls=new ArrayList<>();
        HashMap<String,Integer>hm=new HashMap<>();
        for(String w1:words1){
            hm.put(w1,hm.getOrDefault(w1,0)+1);
        }
        int ct=0;
        for(String w2:words2){
            Integer fr=hm.get(w2);
            if(fr!=null && fr<=1)
            {    if(fr==1)
                ct++;
            else if(fr==0)
                ct--;
            hm.put(w2,fr-1);
        }
         
    }   return ct;
    }
}