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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        if(root==null)
            return 0;
        traverse(root);
        return max;
    }
    public int traverse(TreeNode root){
        if(root==null)return 0;
        int leftc=traverse(root.left);
        int rightc=traverse(root.right);
        int locmax=Math.max(Math.max(root.val,root.val+leftc)
                            ,Math.max(root.val+rightc,root.val+leftc+rightc));
        max=Math.max(max,locmax);
        return Math.max(root.val,Math.max(root.val+leftc,root.val+rightc));
    }
}