class Solution {
    public int[] mostCompetitive(int[] arr, int k) {
         Stack<Integer> st = new Stack<>();

        for(int i=0; i<arr.length; i++){
            
            while(st.size()!=0 && arr[st.peek()]>arr[i] && st.size()+arr.length-i>k) st.pop();
            if(st.size()<k) st.push(i);
        }

        int ans[] = new int[k];

        for(int i=k-1; i>=0; i--){
            ans[i] = arr[st.pop()];
        }
        return ans;
    }
}