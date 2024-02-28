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
    public int findBottomLeftValue(TreeNode root) {
       Queue<TreeNode>q=new LinkedList<>();
        int ct=0;
        q.add(root);
        
        while(!q.isEmpty()){
            int sz=q.size();
            for(int i=0;i<sz;i++){
                TreeNode pq= q.poll();
                if(i==0)
                    ct=pq.val;
                if(pq.left!=null)
                    q.add(pq.left);
                if(pq.right!=null)
                    q.add(pq.right);
            }
        }
        return ct;
    }
}