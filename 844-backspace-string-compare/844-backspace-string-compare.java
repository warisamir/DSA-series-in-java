class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack<Character>st=new Stack<>();
        Stack<Character>st2=new Stack<>();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        add(st,s);
        add(st2,t);
        if(st.size()!=st2.size()) return false;
       while(st.size()>0){
              char c= st.pop();
           char ch=st2.pop();
           if(c!=ch)
               return false;
       }
        return true;
    }
    public void add(Stack<Character>st,String s)
    {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#')
            {  if(st.size()>0)
               st.pop();
            }
            else
                st.push(s.charAt(i));
        }
    }
    
    
}