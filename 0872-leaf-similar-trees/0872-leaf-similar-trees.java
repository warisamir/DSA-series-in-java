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
    ArrayList<Integer>ls1=new ArrayList<>();
    ArrayList<Integer>ls=new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        helper(root1,ls);
        helper(root2,ls1);
        if(ls.equals(ls1))
        return true;
        return false;
    }
    public void helper(TreeNode root,ArrayList<Integer>ls){
        if(root==null)return;
        if(root.left==null && root.right==null)
        { ls.add(root.val);
        return ;
        }
        helper(root.left,ls);
        helper(root.right,ls);
    }
}