class Solution {
    public String longestCommonPrefix(String[] s) {
        String st=s[0];
        for(int i=1;i<s.length;i++){
            st=checkbox(s[i],st);
            if(st.length()==0)
                return "";
        }
        return st;
    }
    public String checkbox(String s,String st){
         int k=Math.min(s.length(),st.length());
        int i;
        for( i=0;i<k;i++){
            if(!(s.charAt(i)==st.charAt(i)))
                break;
        }
        return st.substring(0,i);
    }
}