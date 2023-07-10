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
    public int minDepth(TreeNode root) {
        if(root==null)return  0;
            int left=minDepth(root.left);
        int righ=minDepth(root.right);
        if(root.left!=null && root.right!=null)
            return Math.min(left+1,righ+1);
        return Math.max(left+1,righ+1);
    }
}