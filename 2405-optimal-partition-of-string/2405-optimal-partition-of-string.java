class Solution {
    public int partitionString(String s) {
        HashSet<Character>hs=new HashSet<>();
        int ct=0;
        for(char ch:s.toCharArray()){
           if(hs.contains(ch)){
               ct++;
               hs=new HashSet<>();
               hs.add(ch);
           } 
            else
                hs.add(ch);
        }
        if(!hs.isEmpty())
            ct++;
        return ct;
    }
}