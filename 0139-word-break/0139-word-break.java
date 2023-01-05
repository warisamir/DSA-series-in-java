class Trie{
    Trie child[]=new Trie[26];
    boolean eow=false;
}
class Solution {
    Trie root=new Trie();;
    public boolean wordBreak(String s, List<String> b) {
      for(String s1:b){
          add(s1);
      } 
        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;
        
        for(int i=0;i<s.length();i++){
            if(!dp[i])
                continue;
            int j=i;
            Trie curr=root;
            while(j<s.length()&& curr.child[s.charAt(j)-'a']!=null)
            {
                curr=curr.child[s.charAt(j)-'a'];
                j+=1;
                if(curr.eow==true)
                    dp[j]=true;
            }
        }
        return dp[s.length()];
       }
public void add(String s){
    Trie node=root;
    for(char ch:s.toCharArray()){
        if(node.child[ch-'a']==null)
            node.child[ch-'a']=new Trie();
        node=node.child[ch-'a'];
    }
    node.eow=true;
}
}