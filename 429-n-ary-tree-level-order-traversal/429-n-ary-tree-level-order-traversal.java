/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ls=new ArrayList<>();
        if(root==null)return ls;
        Queue<Node>mq=new LinkedList<>();
        mq.add(root);
        while(mq.size()>0){
            int ct=mq.size(); 
               List<Integer>re=new ArrayList<>();
            for(int i=0;i<ct;i++){
              Node curr=mq.poll();
                re.add(curr.val);
                for(Node n:curr.children){
                    mq.add(n);
                }
               
            }
            ls.add(re);
        }
        return ls;
    }
}