class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character>hs=new HashSet<>();
        int ct=0;
        for(char i='a';i<='z';i++){
            int ind=s.indexOf(""+i);
            if(ind==-1)continue; 
            int last=s.lastIndexOf(""+i);
            if(ind==last)
                continue;
            hs.clear();
            while(++ind<last){
                hs.add(s.charAt(ind));
            }
            ct+=hs.size();
        }
        return ct;
    }
}