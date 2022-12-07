class Solution {
    public String simplifyPath(String path) {
        Stack<String>st=new Stack<>();
        String p[]=path.split("/"); 
        for(String s:p){
        if(!st.isEmpty() && s.equals(".."))
            st.pop();
        else if(!s.equals("") && !s.equals(".") && !s.equals(".."))
            st.push(s); 
            }
        if(st.isEmpty())
            return "/";
        StringBuilder sb=new StringBuilder();
        for(String s:st){
            sb.append("/").append(s);
        }
        return sb.toString();
    }
}