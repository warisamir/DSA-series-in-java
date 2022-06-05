class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int ast:asteroids){
           collision: {
                while (!st.isEmpty() && ast < 0 && 0 < st.peek()) {
                    if (st.peek() < -ast) {
                        st.pop();
                        continue;
                    } else if (st.peek() == -ast) {
                        st.pop();
                    }
                    break collision;
                }
                st.push(ast);
            }
        }

        int[] ans = new int[st.size()];
        for (int t = ans.length - 1; t >= 0; --t) {
            ans[t] = st.pop();
        }
        return ans;
    }
}