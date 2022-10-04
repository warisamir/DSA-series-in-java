class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        HashMap<Character,Integer>hm2=new HashMap<>();
        for(int i=0;i<t.length();i++){
            hm2.put(t.charAt(i),hm2.getOrDefault(t.charAt(i),0)+1);
        }
        int ct=0;
        for(char c:hm2.keySet()){
            if(hm.containsKey(c)){
                if(hm2.get(c)>hm.get(c))
                    ct+=Math.abs(hm.get(c)-hm2.get(c));
            } 
            else ct+=hm2.get(c);
        }
        return ct;
    }
}