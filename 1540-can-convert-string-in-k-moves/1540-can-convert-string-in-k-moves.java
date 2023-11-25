class Solution {
    public boolean canConvertString(String s, String t, int k) {
        char a[]=s.toCharArray();
        int ct[]=new int[26];
        char b[]=t.toCharArray();
        int sl=a.length;
        if(sl!=b.length) return false;
        for(int i=0;i<sl;i++){
        if(a[i]==b[i])continue;
        
            int tmp=b[i]-a[i];
            if(tmp<0) tmp=tmp+26;
            ct[tmp]++;
            tmp=tmp+(26*(ct[tmp]-1));
            if(tmp>k) return false;
        
         }
        return true;
    }
}