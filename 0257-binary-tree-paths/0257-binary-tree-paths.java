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
    List<String>ls=new ArrayList();
    StringBuilder sb=new StringBuilder();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root);
        return ls;
    }
    public void dfs(TreeNode root){
        if(root==null)return;
        if(root!=null &&(root.left==null && root.right==null))
        {
            String s=""+root.val;
            sb.append(s);
            ls.add(sb.toString());
            sb.delete(sb.length() - s.length(), sb.length());
            return; 
        }
        String s=root.val+"->";
        sb.append(s);
        dfs(root.left);
        dfs(root.right);
        sb.delete(sb.length()-s.length(),sb.length());
    }
}