class WordDictionary{
    Node root;
    public WordDictionary() {
        root=new Node();
    }
    
    public void addWord(String word) {
        Node currNode=root;
        for(char ch:word.toCharArray()){
            if(currNode.child[ch-'a']==null)currNode.child[ch-'a']=new Node();
            currNode=currNode.child[ch-'a'];
        }
        currNode.end=true;
    }
    
    public boolean search(String word) {
        return find(word,0,root);
    }
    
    public boolean find(String word,int index,Node node){
        if(index==word.length()){
            return node.end;
        }
        char ch=word.charAt(index);
        if(ch=='.'){
            for(int i=0;i<26;i++){
                if(node.child[i]!=null&&find(word,index+1,node.child[i]))return true;
            }
        }
        else{
            if(node.child[ch-'a']==null)return false;
            return find(word,index+1,node.child[ch-'a']);
        }
        return false;
    } 
    }

class Node{
    public Node []child=new Node[26];
    public boolean end;
}