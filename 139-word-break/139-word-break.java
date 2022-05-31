class Solution {
    Node root=new Node();
    char []chars;
    boolean[] tri; 
    public boolean wordBreak(String s, List<String> word) {
        for(String w:word){
            Node node=root;
            for(char ch:w.toCharArray()){
                if(node.child[ch-'a']==null)
                node.child[ch-'a']=new Node();
               node =node.child[ch-'a']; 
            }
            node .isEnd=true;
        }
        tri=new boolean[s.length()];
        chars=s.toCharArray();
        return word_iscount(0);
    }
    public boolean word_iscount(int id){
        if(id==chars.length) return true;
        if(tri[id]) return false;
        tri[id]=true;
        Node node=root;
        do{
            node=node.child[chars[id++]-'a'];
            if(node==null) return false;
            if(node.isEnd && word_iscount(id)) return true;
        }
        while(id<chars.length);
        return false;
    }
    public static class Node{
        boolean isEnd=false;
        Node[] child=new Node[26];
    }
}