class Solution {
    public String removeStars(String s) {
       
        Stack<Character>st=new Stack<>();
        StringBuilder s1=new StringBuilder();
   
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.charAt(i)=='*')
                st.pop();
                else
                    st.push(ch);
        }
        
        while(st.size()>0){
            s1.append(st.pop());
        }
        return s1.reverse().toString();
    }
}