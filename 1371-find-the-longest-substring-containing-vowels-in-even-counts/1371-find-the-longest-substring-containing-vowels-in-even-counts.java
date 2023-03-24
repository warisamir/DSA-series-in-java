class Solution {
    public int findTheLongestSubstring(String s) {
        Map<Character,Integer>hm=new HashMap<>();
        hm.put('a',0);
        hm.put('e',1);
        hm.put('i',2);
        hm.put('o',3);
        hm.put('u',4);
        int len=0;
        Map<Integer,Integer>hm2=new HashMap<>(22);
        int odd=0;
        hm2.put(0,-1);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)) 
            odd =(odd)^(1<<hm.get(ch));
            hm2.putIfAbsent(odd, i);
            len=Math.max(len, i-hm2.get(odd));
        }
        return len;
    }
}