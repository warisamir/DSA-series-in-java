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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer>ls=new ArrayList<>();
        Inorder(root,ls);
        int s=0;
        int le=0,r=ls.size()-1;
        while(le<r){
            s=ls.get(le)+ls.get(r);
            if(s==k)
                return true;
            else if(s<k)
                le++;
            else
                r--;
        }
        return false;
    }
    public void Inorder(TreeNode root,List<Integer>l){
        if(root==null)return;
        Inorder(root.left,l);
        l.add(root.val);
        Inorder(root.right,l);
    }
}