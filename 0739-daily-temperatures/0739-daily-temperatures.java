class Solution {
    public int[] dailyTemperatures(int[] T) {
      int ans[]=new int[T.length];
        Stack<Integer>st=new Stack<>();
        st.push(0);
        for(int i=0;i<T.length;i++){
            while(st.size()>0 && T[st.peek()]<T[i]){
                ans[st.peek()]=i-st.peek();
                st.pop();
            }
            
            st.push(i);
        }
    return ans;
        }
}