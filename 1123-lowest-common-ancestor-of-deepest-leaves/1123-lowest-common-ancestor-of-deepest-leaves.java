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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null)
            return null;
        int left=depth(root.left);
        int right=depth(root.right);
        if(left==right)
            return root;
        else if(left>right)
           return lcaDeepestLeaves(root.left);
        else
            return lcaDeepestLeaves(root.right);
    }
    public int depth(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(depth(root.left),depth(root.right));
    }
}