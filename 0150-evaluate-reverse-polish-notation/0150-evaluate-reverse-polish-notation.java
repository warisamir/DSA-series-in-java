class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<t.length;i++){
            String ch=t[i];
            if(ch.equals("+")){
                int a=st.pop();
                int b=st.pop();
                int res=a+b;
                st.push(res);
            }
            else if(ch.equals("-")){
                int a=st.pop();
                int b=st.pop();
                int res=b-a;
                st.push(res);
            }
            else  if(ch.equals("/")){
                int a=st.pop();
                int b=st.pop();
                if(a!=0){
                int res=b/a;
                st.push(res);
                }
                else
                    st.push(b);
            } 
            else if(ch.equals("*")){
                int a=st.pop();
                int b=st.pop();
                int res=a*b;
                st.push(res);
            }
          else{
                int n=Integer.parseInt(ch);
              st.push(n);
                    }
        }
                    return st.peek();
    }
}