class Solution {
    public boolean equalFrequency(String word) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<word.length();i++){
            hm.put(word.charAt(i),hm.getOrDefault(word.charAt(i),0)+1);
        }
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(hm.get(c)==1)
                hm.remove(c);
                else 
                    hm.put(c,hm.get(c)-1);
            Set<Integer>hs=new HashSet<>(hm.values());
            if(hs.size()==1)return true;
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        return false;
    }
}