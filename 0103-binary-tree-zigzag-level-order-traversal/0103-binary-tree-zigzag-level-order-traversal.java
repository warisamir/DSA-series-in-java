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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        int level=0;
        q.add(root);
        while(!q.isEmpty())
        {
            level++;
            int sz=q.size();
            List<Integer>ls=new ArrayList<>();
            while(sz-->0){
                TreeNode curr=q.remove();
                if(curr==null) continue;
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
                  ls.add(curr.val);
                
            }
            if(level%2==0)
            {
               Collections.reverse(ls); 
            }   
               res.add(ls);
            
        }
        return res;
    }
}