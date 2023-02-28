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
    Map<String,Integer>hm;
    List<TreeNode>ls;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        hm=new HashMap<>();
        ls=new ArrayList<>();
        dfs(root);
        return ls;
    }
    public String dfs(TreeNode root){
        if(root==null)return "@";
        String path= root.val+"||"+dfs(root.left)+"||"+dfs(root.right);
        hm.put(path,hm.getOrDefault(path,0)+1);
        if(hm.get(path)==2)
            ls.add(root);
        return path;
    }
}