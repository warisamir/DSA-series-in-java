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
    int val;
        int dep;
    public TreeNode addOneRow(TreeNode root, int val, int dep) {
       this.dep=dep;
           this.val=val;
           if(dep==1)
           {
               TreeNode nNode=new TreeNode(val);
               nNode.left=root;
               return nNode;
           }
        helper(root,1);
        return root;
    }
    public void helper(TreeNode root,int depth){
       if(root==null)
           return ;
        if(depth==dep-1){
            TreeNode left=root.left;
            TreeNode node=new TreeNode(val);
            root.left=node;
            node.left=left;
            TreeNode right=root.right;
            TreeNode newR=new TreeNode(val);
            root.right=newR;
            newR.right=right;
            return ;
        }
        helper(root.left,depth+1);
        helper(root.right,depth+1);
    }
}