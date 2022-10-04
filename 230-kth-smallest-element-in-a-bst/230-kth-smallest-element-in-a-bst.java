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
    //we make 2 instance to store the result and increasing the value of i to compare the iteration during recursive call
    int i=1;
        int res=0;
    public int kthSmallest(TreeNode root, int k) {
         dfs(root,k);
        return res;
    }
    //we make dfs call in which we are getting the output during the inorder
    public void dfs(TreeNode root,int k){
        if(root==null)
            return ;
        dfs(root.left,k);
        if(k==i)
            res=root.val;
        i++;
        dfs(root.right,k);
    }
}