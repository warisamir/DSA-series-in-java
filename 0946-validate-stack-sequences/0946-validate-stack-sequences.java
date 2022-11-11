class Solution {
    public boolean validateStackSequences(int[] pp, int[] po) {
        Stack<Integer>st=new Stack<>();
        int k=0;
       for(int val:pp)
       {
              st.push(val);
         while(!st.isEmpty() && st.peek()==po[k])
        { st.pop();
            k++; }
            
        }
        return st.isEmpty()?true:false;
    }
}