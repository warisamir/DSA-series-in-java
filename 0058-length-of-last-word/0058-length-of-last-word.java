class Solution {
    public int lengthOfLastWord(String s) {
        String st[]=s.split(" ");
        int len=st[st.length-1].length();
        return len;
    }
}