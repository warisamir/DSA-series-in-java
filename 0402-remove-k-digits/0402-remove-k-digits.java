class Solution {
    public String removeKdigits(String s, int k) {
        int sz=s.length();
        Stack<Character>st=new Stack<>();
       for(char ch:s.toCharArray()){
           while(!st.isEmpty() && k>0 && st.peek()>ch){
               st.pop();k--;
           }
           if(!st.isEmpty() ||ch!='0')
           st.push(ch);
       }
        while(!st.isEmpty() && k-->0){
            st.pop();
        }if(st.isEmpty())
            return 0+"";
        StringBuilder s1=new StringBuilder();
        while(!st.isEmpty()){
            s1.append(st.pop());
        }return s1.reverse().toString();
      }
}