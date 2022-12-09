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
    int ans=-1;
    public int maxAncestorDiff(TreeNode root) {
       
        helper(root,root.val,root.val);
        return ans;
    }
    public void helper(TreeNode root,int max,int min){
        if(root==null) return ;
        else if(root.val>max)
            max=root.val;
        else if(root.val<min)
            min=root.val;
        int temp=Math.max(Math.abs(max-root.val),Math.abs(root.val-min));
        if(temp>ans)
            ans=temp;
        helper(root.left,max,min);
        helper(root.right,max,min);
    }
}