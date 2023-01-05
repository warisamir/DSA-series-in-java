class MapSum {
class Node{
    Node child[]=new Node[26];
      int value=0;
}
    Node root;
    public MapSum() {
        root=new Node();
    }
    
    public void insert(String key, int val) {
        Node temp=root;
        for(char ch:key.toCharArray()){
            if(temp.child[ch-'a']==null)
                temp.child[ch-'a']=new Node();
            temp=temp.child[ch-'a'];
        }
        temp.value=val;
    }
    int sum=0;
    public int sum(String prefix) {
         Node temp=root;
        for(char ch:prefix.toCharArray()){
            if(temp.child[ch-'a']==null)
              return 0;
            temp=temp.child[ch-'a'];
        }
        sum=0;
        helper(temp);
        return sum;
    }
    void helper(Node node){
        sum+=node.value;
        for(Node nbr:node.child){
            if(nbr!=null)
                helper(nbr);
        }
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */