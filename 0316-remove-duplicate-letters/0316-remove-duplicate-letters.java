class Solution {
    public String removeDuplicateLetters(String s) {
    int arr[]=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        boolean ais[]=new boolean[26];
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            arr[ch-'a']--;
            if(ais[ch-'a']==false)
            {
                while(st.size()>0 && arr[st.peek()-'a']>0 && ch<st.peek())
                {
                    ais[st.peek()-'a']=false;
                    st.pop();
                }
                st.push(ch);
                ais[ch-'a']=true;
            }
        }
        StringBuilder sb=new StringBuilder();
     while(st.size()>0){
            sb.append(st.peek());
            st.pop();
        }
        return sb.reverse().toString();
    }
}