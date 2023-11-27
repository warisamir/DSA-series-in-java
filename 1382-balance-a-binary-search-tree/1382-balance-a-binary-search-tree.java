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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer>ls=new ArrayList<>();
        Inorder(ls,root);
        return helper(ls,0,ls.size()-1);
    }
    public void Inorder(ArrayList<Integer>ls,TreeNode root){
        if(root==null)
            return;
        Inorder(ls,root.left);
        ls.add(root.val);
        Inorder(ls,root.right);
    }
    public TreeNode helper(ArrayList<Integer>ls,int s,int en){
        if(s>en)
            return null;
        int mid=s+(en-s)/2;
        TreeNode root=new TreeNode(ls.get(mid));
        root.left=helper(ls,s,mid-1);
        root.right=helper(ls,mid+1,en);
        return root;
    }
}