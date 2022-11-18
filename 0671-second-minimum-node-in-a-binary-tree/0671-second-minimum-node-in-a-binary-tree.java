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
    int min=Integer.MAX_VALUE;
    int sec_min=Integer.MAX_VALUE;
  int i=-1;
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null)return 0;
        if(root.val<min)
            min=root.val;
        if(root.val>min && sec_min>=root.val)
        {
            i=0;
            sec_min=root.val;
        }
       findSecondMinimumValue(root.left);
       findSecondMinimumValue(root.right);
        return i==-1?-1:sec_min;
    }
}