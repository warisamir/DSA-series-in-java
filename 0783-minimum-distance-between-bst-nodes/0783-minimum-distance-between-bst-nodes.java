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
    int l=Integer.MAX_VALUE;
        int r=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return l;
    }
    void inorder(TreeNode root){
       if(root==null)return ;
        inorder(root.left);
        l=Math.min(l,Math.abs(r-root.val));
        r=root.val;
        inorder(root.right);
    }
}