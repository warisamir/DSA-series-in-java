/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        //make copies
         if(head==null)return null; Node prev=head,curr=prev.next;
      
        while(prev!=null){
            Node next=null;
            if(curr!=null)
                next=curr.next;
            Node temp=new Node(prev.val);
            prev.next=temp;
            temp.next=curr;
            prev=curr;
            curr=next;
        }
        //set random
        Node temp=head;
        while(temp!=null){
            if(temp.random!=null)
                temp.next.random=temp.random.next;
            temp=temp.next.next;
        }
       //extract node 
        Node res=head.next;
        temp=head;
        while(temp.next!=null){
            Node next=temp.next;
            temp.next=temp.next.next;
            temp=next;
        }
        return res;
    }
}