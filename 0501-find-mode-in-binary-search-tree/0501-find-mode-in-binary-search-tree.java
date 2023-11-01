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
    private HashMap<Integer,Integer>mp=new HashMap<>();
    public void isValid(TreeNode root){
        if(root==null)
            return ;
        isValid(root.left);
        mp.put(root.val,mp.getOrDefault(root.val,0)+1);
        isValid(root.right);
        
    }
    public int[] findMode(TreeNode root) {
         isValid(root); // Call the helper function to populate the frequency map

        int maxi = 0;
        // Find the maximum frequency encountered
        for (int value : mp.values()) {
            maxi = Math.max(maxi, value);
        }

        List<Integer> ans = new ArrayList<>();
        // Collect elements with the maximum frequency in the result list
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == maxi) {
                ans.add(entry.getKey());
            }
        }

        // Convert the list to an array
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}