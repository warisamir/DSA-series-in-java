class LRUCache {
    class Node{
       int key;
        int value;
        Node next;
        Node prev;
    }
    public void addFirst(Node node){
        Node m1=head;
        Node p1=head.next;
        node.prev=m1;
        node.next=p1;
        m1.next=node;
        p1.prev=node;
    }
    public void remove(Node node){
        Node m1=node.prev;
        Node p1=node.next;
        m1.next=p1;
        p1.prev=m1;
    }
    HashMap<Integer,Node>hm;
    int cap;
    Node head,tail;  
    public LRUCache(int capacity) {
        hm=new HashMap<>();
        cap=capacity;
        head=new Node();
        tail=new Node();
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
     if(hm.containsKey(key)==false)
         return -1;
        else{
            Node node=hm.get(key);
        remove(node);
        addFirst(node);
        return node.value;
    }
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)==false)
        {
            if(hm.size()==cap){               
                hm.remove(tail.prev.key);
                remove(tail.prev);
            }
          Node node=new Node();
            node.key=key;
            node.value=value;
            addFirst(node);
            hm.put(key,node);
        }
        else{
              Node node=hm.get(key);
        remove(node);
        addFirst(node);
        node.value=value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */