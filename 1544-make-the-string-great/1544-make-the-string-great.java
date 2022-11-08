class Solution {
    public String makeGood(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && Math.abs(st.peek()-ch)==32)
                st.pop();
            else
                st.push(ch);
        }
       char []ch=new char[st.size()];
        for(int i=ch.length-1;i>=0;i--){
            ch[i]=st.pop();
        }
        return new String(ch);
    }
}