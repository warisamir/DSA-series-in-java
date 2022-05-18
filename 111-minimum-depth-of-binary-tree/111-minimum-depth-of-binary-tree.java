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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null) return 0;
        q.add(root);
        int count=0;
        Boolean e=false;
        while(q.size()>0){
            int n=q.size();
            count++;
            for(int i=0;i<n;i++){
                TreeNode nod=q.poll();
                if(nod.left==null && nod.right==null)
                    e=true;
                if(nod.left!=null)
                    q.add(nod.left);
                if(nod.right!=null)
                    q.add(nod.right);
            }
        
        if(e==true) break;
        }
        return count;
    }
}