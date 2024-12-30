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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int count=0;
        while(!q.isEmpty())
        {
            TreeNode curr=q.peek();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                curr=q.remove();
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
            }
            int[] arr=new int[q.size()];
            int j=0;
            for(TreeNode ele:q)
            {
                arr[j++]=ele.val;
            }
            count+=minSwaps(arr, j);
        }
        return count;
    }
    private  int minSwaps(int []nums, int n)
    {
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        int ct=0;
        Arrays.sort(nums);
   
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])!=i){
            ct++;
            swap(nums,i,hm.get(nums[i]));
            i--;
            }
        }
        return ct;
    }
    public void swap(int arr[],int x,int y){
        int temp= arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
