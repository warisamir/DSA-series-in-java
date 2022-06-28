class Solution {
    public int minDeletions(String s) {
        int ct =0;
        HashMap<Character,Integer>hm=new HashMap<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
        hm.put(ch[i],hm.getOrDefault(ch[i],0)+1);
        }
        HashSet<Integer>hs=new HashSet<>();
     for(char c:hm.keySet()){
         int freq=hm.get(c);
         if(!hs.contains(freq))hs.add(freq);
        else{
             while(freq>0 && hs.contains(freq)){
                 freq--;
                 ct++;
             
         }
         if(freq>0) hs.add(freq);
     }
     }
        return ct;
    }
}