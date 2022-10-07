class Solution {
    public int[] dailyTemperatures(int[] T) {
       int dp[]=new int[T.length];
        int n=T.length;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && T[i]>T[st.peek()]){
             dp[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
            }
        return dp;
            }
}