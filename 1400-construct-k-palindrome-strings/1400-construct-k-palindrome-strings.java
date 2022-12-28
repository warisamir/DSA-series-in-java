class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k)return false;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int ct=0;
        for(int ky:hm.values()){
            if(ky%2==1)ct++;
        }
        return ct<=k?true:false;
    }
}