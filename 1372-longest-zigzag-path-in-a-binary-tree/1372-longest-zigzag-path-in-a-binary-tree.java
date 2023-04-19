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
    int max=0;
    public int longestZigZag(TreeNode root) {
        dfs(root.left,0,1);
        dfs(root.right,1,1);
        return max;
    }
    public void dfs(TreeNode root,int dir,int len){
        if(root==null)
            return ;
        max=Math.max(max,len);
        if(dir==0)
        {dfs(root.left,dir,1);
        dfs(root.right,dir^1,len+1);}
        else{
            dfs(root.left,dir^1,len+1);
            dfs(root.right,dir,1);
        }
        return;
   }
}