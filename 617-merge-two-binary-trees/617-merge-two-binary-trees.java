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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode result=null;
        if(t1==null && t2==null)return result;
        if(t1!=null && t2==null)
        {
                result = new TreeNode(t1.val);

                result.left = mergeTrees(t1.left, null);
                result.right = mergeTrees(t1.right, null);
            }

            if (t1 == null && t2 != null) {
                result = new TreeNode(t2.val);

                result.left = mergeTrees(null, t2.left);
                result.right = mergeTrees(null, t2.right);
            }

            if (t1 != null && t2 != null) {
                result = new TreeNode(t1.val + t2.val);

                result.left = mergeTrees(t1.left, t2.left);
                result.right = mergeTrees(t1.right, t2.right);
            }
return result;
    }
}