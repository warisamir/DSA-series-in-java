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
    public List<List<Integer>> pathSum(TreeNode root, int ts) {
        List<List<Integer>> ans=new ArrayList<>();
        dfs(root,ts,new ArrayList<>(),ans);
        return ans;
       
}
void dfs(TreeNode root,int ts,List<Integer>ls,List<List<Integer>>ans){
    if(root==null)
    return ;
    if(root.val==ts && root.left==null && root.right==null){
        ls.add(root.val);
    ans.add(new ArrayList<>(ls));
    ls.remove(ls.size()-1);
    return;
}
    ls.add(root.val);
    dfs(root.left,ts-root.val,ls,ans);
    dfs(root.right,ts-root.val,ls,ans);
    ls.remove(ls.size()-1);
}
}