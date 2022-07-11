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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> que=new ArrayDeque();
        que.add(root);
        while(que.size()!=0){
            int size=que.size();
            ans.add(que.peek().val);
            while(size-->0){
                TreeNode rnod=que.remove();
             if(rnod.right!=null) que.add(rnod.right);
                if(rnod.left!=null) que.add(rnod.left);
           
            }
        }
        
        return ans;
    }
}