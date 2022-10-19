class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer>hm=new HashMap<>();
        for(String s:s1.split(" ")){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        for(String s:s2.split(" ")){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        List<String>ls=new ArrayList<>();
        for(String i:hm.keySet()){
            if(hm.get(i)==1)
                ls.add(i);
        }
        return ls.toArray(new String[ls.size()]);
    }
}