class Solution {
    public boolean canConstruct(String r, String m) { 
        int fre[]=new int[26];
        int of=97;
        for(int i=0;i<m.length();i++){
            int c=m.charAt(i)-of;
            fre[c]++;
        }
        for(int i=0;i<r.length();i++){
            int c=r.charAt(i)-of;
            fre[c]--;
        
        if(fre[c]<0) return false;
        }
        return true;
    }
}