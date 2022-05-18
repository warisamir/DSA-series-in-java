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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        int count=0;
        while(q.size()>0){
            int n=q.size();
            count++;
            for(int i=0;i<n;i++){
                TreeNode no=q.poll();
                if(no.left!=null)
                    q.add(no.left);
                if(no.right!=null)
                    q.add(no.right);
            }
            
        }
        return count;

    }
}