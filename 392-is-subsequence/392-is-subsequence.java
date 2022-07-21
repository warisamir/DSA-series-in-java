class Solution {
    public boolean isSubsequence(String s, String t) {
        int s1=0;
        if(s.length()==0)return true;
        for(int i=0;i<t.length();i++){
        if(s.charAt(s1)==t.charAt(i))
            s1++;
            if(s1==s.length())
                break;
        }
        if(s1==s.length())
            return true;
        return false;
    }
}