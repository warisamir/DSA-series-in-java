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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
       traversal(l,root);
            return l;
    }
    public void traversal(List l,TreeNode node){
        if(node==null)
            return ;
        traversal(l,node.left);
        l.add(node.val);
        traversal(l,node.right);
    }
}