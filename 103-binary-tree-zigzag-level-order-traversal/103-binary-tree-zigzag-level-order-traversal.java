/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List <List<Integer>>res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q=new LinkedList<>();
    q.offer(root);
        boolean reverse=false;
        while(!q.isEmpty()){
            LinkedList <Integer>curr=new LinkedList<>();
            Queue <TreeNode> next=new LinkedList<>();
            while(!q.isEmpty()){
                TreeNode node=q.poll();
                if(!reverse)
                    curr.add(node.val);
                else
                    curr.addFirst(node.val);
                if(node.left!=null) next.offer(node.left);
                if(node.right!=null) next.offer(node.right);
            }
            res.add(curr);
            q=next;
            reverse=!reverse;
    }
        return res;
}
}