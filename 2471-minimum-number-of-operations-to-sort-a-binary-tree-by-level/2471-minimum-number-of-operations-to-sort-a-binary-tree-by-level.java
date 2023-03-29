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
    // class Pair{
    //     int val,id;
    //     Pair(int val,int id){
    //         this.val=val;
    //         this.id=id;
    //     }
    // }
    public int minimumOperations(TreeNode root) {
        LinkedList<TreeNode>q=new LinkedList<>();
        q.addLast(root);
        int res=0;
        while(q.size()>0){
            int arr[]=new int[q.size()];
            int size=q.size();
            int i=0;
            while(size-->0){
                TreeNode leftnode=q.removeFirst();
                arr[i++]=leftnode.val;
                if(leftnode.left!=null)
                    q.add(leftnode.left);
                if(leftnode.right!=null)
                    q.add(leftnode.right);
            
        }
        res+=minswap(arr);
    }
        return res;
    }
    public int minswap(int arr[]){
       if(isDesc(arr)) return arr.length/2;
        int count = 0,i = 0;
        while(i<arr.length){
            int idx = 0;
            for(int num:arr) if(num<arr[i]) idx++;
            if(i == idx) i++;
            else{
                int t = arr[i];
                arr[i] = arr[idx];
                arr[idx] = t;
                count++;
            }
        }
        return count;
    }

    boolean isDesc(int[] arr){
        for(int i=0;i<arr.length-1;i++)
            if(arr[i]<arr[i+1])
                return false;
        return true;
    }
}