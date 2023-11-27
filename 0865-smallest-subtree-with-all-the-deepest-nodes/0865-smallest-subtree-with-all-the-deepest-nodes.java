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
    int deep=0;
    TreeNode res=null;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        dfs(root,0);
        return res;
    }
    private int dfs(TreeNode root,int level){
        if(root==null)
            return level;
        int depthofleft=dfs(root.left,level+1);
        int depthofright=dfs(root.right,level+1);
        int currdepth=Math.max(depthofleft,depthofright);
        deep=Math.max(currdepth,deep);
        if(depthofleft==deep && depthofright==deep)
            res=root;
        return currdepth;
    }
}