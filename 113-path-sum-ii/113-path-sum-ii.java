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
class Solution {List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int ts) {
        dfs(root,ts,new ArrayList<>());
        return ans;
       
}
void dfs(TreeNode root,int ts,List<Integer>ls){
    if(root==null)return ;
    if(root.val==ts && root.left==null &&root.right==null){
        ls.add(root.val);
        ans.add(new ArrayList<>(ls));
        ls.remove(ls.size()-1);
    }
   
        ls.add(root.val);
        dfs(root.left,ts-root.val,ls);
        dfs(root.right,ts-root.val,ls);
        ls.remove(ls.size()-1);
    
}
}