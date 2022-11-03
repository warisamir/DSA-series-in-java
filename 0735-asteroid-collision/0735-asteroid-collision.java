class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int ast:asteroids){
            if(st.size()==0)
                st.push(ast);
            else if(ast>0)
                st.push(ast);
            else if(st.peek()<0)
                st.push(ast);
            else
            {
                while(st.size()>0 && st.peek()>0 &&st.peek()<Math.abs(ast))
                    st.pop();
                if(st.size()==0)
                {
                    st.push(ast);
                }
                else if(st.peek()<0)
                    st.push(ast);
                else if(st.peek()==Math.abs(ast)){
                    st.pop();
                }
                else if(st.peek()>Math.abs(ast));
            }
        }
        int ans[]=new int[st.size()];
        int id=ans.length-1;
        while(st.size()>0){
            ans[id]=st.pop();
            id--;
        }
        return ans;
    }
}