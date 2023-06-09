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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null) return null;
        root.left=trimBST(root.left,low,high);
        root.right=trimBST(root.right,low,high);
        if(root.val<low || root.val>high){
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left!=null && root.right!=null)
                return root.right;
            if(root.left==null)
                return root.right;
            if(root.right==null)
                return root.left;
        }
        return root;
    }
}