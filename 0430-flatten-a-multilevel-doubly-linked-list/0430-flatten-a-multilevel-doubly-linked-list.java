/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
          Node temp=head;
        while(temp!=null){
            if(temp.child!=null){
                Node swtch=temp.next;
                Node tempC=temp.child;
                temp.next=temp.child;
                while(tempC.next!=null){
                    tempC=tempC.next;
                }
                temp.child.prev=temp;
                tempC.next=swtch;
                if(swtch!=null){
                    swtch.prev=tempC;
                }
                temp.child=null;
                
            }
            temp=temp.next;
        }
        return head;
    }
}