/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Node vis[];
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        vis=new Node[101];
        // if(node.neighbors.size()==0)
            // return new node(node.val);
        return dfs(node);
    }
    public Node dfs(Node node){
        if(vis[node.val] != null) return vis[node.val];
        vis[node.val] = new Node(node.val);
        for(Node n: node.neighbors) vis[node.val].neighbors.add(dfs(n));
        return vis[node.val];
    }
}