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
    TreeNode ans;
    public TreeNode increasingBST(TreeNode root) {
       TreeNode result=new TreeNode(0);
        ans=result;
        helper(root);
        return result.right;
    }
     public void helper(TreeNode root){
         if(root==null)return ;
     helper(root.left);
    ans.right=new TreeNode(root.val);
        ans=ans.right;
         helper(root.right);
    }
}