class Solution {
    HashSet<String>hs=new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        List<String>ls=new ArrayList<>(); 
        solve(s,getMin(s),hs,ls);
       return ls;
    }
    public void solve(String s,int k,HashSet<String>set,List<String>ls){
        if(set.contains(s)){
            return;
        }
        set.add(s);
        
        if (k == 0) {
            int isStackEmpty = getMin(s);
            if (isStackEmpty == 0) {
                ls.add(s);
            }
            return;
        }
		for(int i=0;i<s.length();i++){
			String left=s.substring(0,i);
			String righ = s.substring(i+1);
			solve(left+righ,k-1,hs,ls);
		}
	}

	public int getMin(String str){
		Stack<Character>st=new Stack<>();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='(')
			st.push(ch);
			else if(ch==')')
			{
				if(st.size()==0)
				st.push(ch);
				else if(st.peek()=='(')
				st.pop();
				else if(st.peek()==')')
				st.push(ch);
			}
		}
		return st.size();
	} 
}