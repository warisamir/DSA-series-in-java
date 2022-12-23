class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer>st=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='(')
                st.push(i);
                else if(ch=='*')
                    st2.push(i);
                    else if(ch==')'){
                      if(!st.isEmpty())
                          st.pop();
                        else if(!st2.isEmpty())
                            st2.pop();
                        else 
                            return false;
                    }
            i++;
        }
        while(!st.isEmpty() && !st2.isEmpty())
        {
            if(st.peek()>st2.peek())
                return false;
            st.pop();
            st2.pop();
        }
        return st.isEmpty();
    }
}