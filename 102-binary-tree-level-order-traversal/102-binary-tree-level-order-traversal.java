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
       Queue<TreeNode>mq=new ArrayDeque<>();
        Stack<TreeNode> st=new Stack<>();
        mq.add(root);
        while(mq.size()>0){
           int ct=mq.size();
            List<Integer>re=new ArrayList<>();
            for(int i=0;i<ct;i++){
                TreeNode cur=mq.poll();
                re.add(cur.val);
                if(cur.left!=null)
                    mq.add(cur.left);
                if(cur.right!=null)
                    mq.add(cur.right);
            }
            res.add(re);
        }
     
    
        return res; 
    }
}
  