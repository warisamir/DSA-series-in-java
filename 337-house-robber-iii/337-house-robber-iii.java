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
    HashMap<TreeNode ,Integer>hm=new HashMap<>();
    public int rob(TreeNode root) {
        if(root==null) return 0;
        if(hm.containsKey(root))
            return hm.get(root);
        int sum=root.val;
        if(root.left!=null)
            sum+=rob(root.left.left)+rob(root.left.right);
        if(root.right!=null)
            sum+=rob(root.right.left)+rob(root.right.right);
        int lsum=rob(root.left)+rob(root.right);
        int re= Math.max(lsum,sum);
        hm.put(root,re);
        return re;
    }
}