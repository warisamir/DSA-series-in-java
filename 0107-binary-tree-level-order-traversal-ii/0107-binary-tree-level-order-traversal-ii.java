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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>>res=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)
            return res;
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer>ls=new ArrayList<>();
            int sz=q.size();
            for(int i=0;i<sz;i++){
                 TreeNode curr=q.remove();
                ls.add(curr.val);
                if(curr.left!=null)
                    q.offer(curr.left);
                if(curr.right!=null)
                    q.offer(curr.right);
            }  
            res.add(ls);
        }
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=res.size()-1;i>=0;i--){
            ans.add(res.get(i));
        }
        return ans;
    }
}