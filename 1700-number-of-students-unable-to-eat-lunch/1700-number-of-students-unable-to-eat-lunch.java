class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // Stack<Integer>st=new Stack<>();
        Queue<Integer>qu=new LinkedList<>();
        for(int i=0;i<sandwiches.length;i++){
            // st.push(sandwiches.length-1-i);
            qu.add(students[i]);
        }
        int n=sandwiches.length;
        int ans=0,ct=0;
         while(ans!=n && ct!=qu.size()){
             if(qu.peek()==sandwiches[ans]){
                 qu.remove();
                 ans++;
                 ct=0;
             }
             else{
                 qu.add(qu.remove());
                 ct++;
             }
         }
        return n-ans;
    }
}