/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
//         Queue <Node> q=new LinkedList<>();
//         q.add(root);
//         Node temp=null;
//         while(!q.isEmpty()){
//             int n=q.size();
//             for(int i=0;i<n;i++){
//                 Node prev=temp;
//                 prev=q.poll();
//                 if(i>0)
//                     prev.next=temp;
//                 if(temp.left!=null)
//                     q.add(temp.left);
                
//                     if(temp.right!=null)
//                         q.add(temp.right);
                
//             }
        
//         }
//         return temp;
//     }
        if(root==null) return null;
        Node head=root;
        while(head!=null){
            Node dummy=new Node(0);
            Node temp=dummy;
            while(head!=null){
                if(head.left!=null){
                    temp.next=head.left;
                    temp=temp.next;
                    
                }
                if(head.right!=null){
                    temp.next=head.right;
                    temp=temp.next;
                }
                    head=head.next;
                
                }
                head=dummy.next;
        }
            return root;
        }
}