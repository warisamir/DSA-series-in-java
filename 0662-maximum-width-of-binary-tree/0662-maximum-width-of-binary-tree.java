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
    int left = 0;
    int right = 0;

    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        int ans = 0;
        
        while(!q.isEmpty()){
            int len = q.size();
            int l = 0;
            int r = 0;

            for(int i = 0; i<len; i++){
                Pair curr = q.poll();
                TreeNode currNode = curr.node;
                int n = curr.n;
                
                //For 0 based indexing
                //Left child index = 2*n + 1;
                //Right child index = 2*n + 2; 

                if(currNode.left!= null) 
                    q.add(new Pair(currNode.left , 2*n +1));
                if(currNode.right!= null) 
                    q.add(new Pair(currNode.right , 2*n +2));

                if(i == 0) l = n;       //1st elemet of level
                if(i == len-1) r = n;   //last element of level
            }

            ans =Math.max(ans , r-l+1);
        }
        return ans;
    }

}

class Pair{
    int n;
    TreeNode node;
    Pair(TreeNode _node , int _n){
        node = _node;
        n = _n;
    }
}
