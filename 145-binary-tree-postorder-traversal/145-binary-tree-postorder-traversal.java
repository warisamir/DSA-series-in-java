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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null){
            if(curr.right==null){
                l.add(curr.val);
                curr=curr.left;
            }
            else{
                TreeNode iop =curr.right;
                while(iop.left!=null && iop.left!=curr){
                   iop=iop.left;
                }
                if(iop.left==null)
                {
                    l.add(curr.val);
                iop.left=curr;
                 curr=curr.right;
                }
                else{
                    iop.left=null;
                    curr=curr.left;
                }
            }
        }
        Collections.reverse(l);
            return l;
    }
}