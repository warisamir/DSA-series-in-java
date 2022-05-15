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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List <List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Deque <TreeNode> mq=new ArrayDeque<>();
        mq.add(root);
        while(!mq.isEmpty()){
            int count=mq.size();
            List<Integer> row=new ArrayList<>();
            for(int i=0;i<count;i++){
                TreeNode curr=mq.poll();
                row.add(curr.val);
                if(curr.left!=null)
                mq.add(curr.left);
                if(curr.right!=null)
                    mq.add(curr.right);
            }
            res.add(row);
        }  
        return res; 
    }
}
  