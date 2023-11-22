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
    class Pair implements Comparable<Pair>{
        TreeNode node;
        int w;
        int d;
        Pair(TreeNode node,int w,int d){
            this.node=node;
            this.d=d;
            this.w=w;
        }
        public int compareTo(Pair e){
            if(this.d==e.d)
              return this.node.val-e.node.val;
           else return this.d-e.d;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Pair>q=new LinkedList<>();
        // ArrayList<ArrayList<Integer>>ls=new ArrayList<>();
        q.add(new Pair(root,0,1));
        int lmval=0,rmval=0;
        HashMap<Integer,ArrayList<Pair>>hm=new HashMap<>();
        while(q.size()>0){
        Pair tem=q.remove();
            if(lmval>tem.w)
                lmval=tem.w;
            if(rmval<tem.w)
                rmval=tem.w;
            if(hm.containsKey(tem.w)==false)
            {
             hm.put(tem.w,new ArrayList<>());
             hm.get(tem.w).add(tem);  
            }
            else 
            hm.get(tem.w).add(tem);
            if(tem.node.left!=null)
                q.add(new Pair(tem.node.left,tem.w-1,tem.d+1));
            if(tem.node.right!=null)
                q.add(new Pair(tem.node.right,tem.w+1,tem.d+1));
        }
        List<List<Integer>>res=new ArrayList<>();
        for(int w=lmval;w<=rmval;w++){
            ArrayList<Integer>list=new ArrayList<>();
             ArrayList<Pair>unsort=hm.get(w);
            Collections.sort(unsort);
            for(Pair temp:unsort)
                list.add(temp.node.val);
                res.add(list);
        }
        return res;
    }
}