class Solution {
    public boolean matchReplacement(String s, String sub, char[][] mappings) {
        HashMap<Character,HashSet<Character>>hm=new HashMap<>();
        for(int i=0;i<mappings.length;i++){
            if(hm.containsKey(mappings[i][0])==false)
                hm.put(mappings[i][0],new HashSet(mappings[i][1]));
            hm.get(mappings[i][0]).add(mappings[i][1]);
        }
        int i=0,j=0,m=s.length(),n=sub.length();
        if(n>m)return false;
        while(i<m && j<n){
            boolean ans=helper(i,j,s,sub,hm);
            if(ans)return true;
            i++;
        }
        return false;
    }
    public boolean helper(int i,int j,String s ,String pat,HashMap<Character,HashSet<Character>>hm){
        if(j==pat.length())return true;
        if(i==s.length())return false;
        if(s.charAt(i)==pat.charAt(j)) return helper(i+1,j+1,s,pat,hm);
        if(hm.containsKey(pat.charAt(j))==false||hm.get(pat.charAt(j)).contains(s.charAt(i))==false)
            return false;
        return helper(i+1,j+1,s,pat,hm);
    }
}