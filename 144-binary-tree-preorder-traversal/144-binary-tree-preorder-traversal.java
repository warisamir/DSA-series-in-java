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
    public List<Integer> preorderTraversal(TreeNode root) {
        return recursivesolution(root,new LinkedList<>());
    }
    public List<Integer> recursivesolution(TreeNode root,List <Integer>ans){
        if(root ==null)return ans;
        ans.add(root.val);
        recursivesolution(root.left,ans);
      recursivesolution (root.right,ans);  
        return ans;
    }
}