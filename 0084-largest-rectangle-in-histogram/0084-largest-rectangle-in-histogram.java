class Solution {
    public int largestRectangleArea(int[] a) {
        
        int left[]=nextsmallertoleft(a);
        int right[]=nextsmallertoright(a);
        int max=0;
        for(int i=0;i<a.length;i++){
            max=Math.max(max,a[i]*(right[i]-left[i]-1));
        }
        return max;
    }
    public int[]nextsmallertoleft(int []a){
        int []ans=new int[a.length];
        Stack<Integer>st=new Stack<>();
        st.push(a.length-1);
        Arrays.fill(ans,-1);
        for(int i=a.length-2;i>=0;i--){ 
        while(st.size()>0 && a[st.peek()]>a[i])
        {
            ans[st.peek()]=i;
            st.pop();
        }
            st.push(i);
            }
        return ans;
    }
      public int[]nextsmallertoright(int []a){
        int []ans=new int[a.length];
        Stack<Integer>st=new Stack<>();
        st.push(0);
          Arrays.fill(ans,a.length);
        for(int i=1;i<a.length;i++){ 
        while(st.size()>0 && a[st.peek()]>a[i])
        {
            ans[st.peek()]=i;
            st.pop();
        }
            st.push(i);
            }
        return ans;
    }
    
}