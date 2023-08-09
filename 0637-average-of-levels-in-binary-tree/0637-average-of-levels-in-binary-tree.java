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
    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null)
            return null;
        ArrayList<Double>ls=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            double avg=0.0;
            for(int i=0;i<size;i++){
                TreeNode fr=q.poll();
                avg+=fr.val;
                if(fr.left!=null)
                    q.offer(fr.left);
                if(fr.right!=null)
                    q.offer(fr.right);
            }
           avg=avg/size;
            ls.add(avg);
        }
        return ls;
    }
}