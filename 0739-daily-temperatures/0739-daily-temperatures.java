class Solution {
    public int[] dailyTemperatures(int[] T) {
      int ans[]=new int[T.length];
        Stack<Integer>st=new Stack<>();
        st.push(T.length-1);
        for(int i=T.length-2;i>=0;i--){
            while(st.size()>0 && T[st.peek()]<=T[i]){
               st.pop();
            }
            if(st.size()>0)
            ans[i]=st.peek()-i;
            st.push(i);
        }
    return ans;
        }
}