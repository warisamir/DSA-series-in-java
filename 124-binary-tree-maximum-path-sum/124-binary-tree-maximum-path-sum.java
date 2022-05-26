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
    private int traverse(TreeNode root){

	        if (root == null) {
	            return 0;
	        }

	        

	        int leftChild = traverse(root.left);
	        int rightChild = traverse(root.right);
    int localMax = Math.max(Math.max(root.val, root.val + leftChild), Math.max(root.val + rightChild, root.val + leftChild + rightChild));
       max = Math.max(max, localMax);
        return Math.max(root.val, Math.max(root.val + rightChild, root.val + leftChild));
	    }
}