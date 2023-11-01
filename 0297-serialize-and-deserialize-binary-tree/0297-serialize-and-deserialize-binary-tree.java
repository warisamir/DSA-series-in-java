/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    public String serialize(TreeNode root) {
         if(root==null)
            return "";
        Queue<TreeNode> q =new LinkedList<>();
        StringBuilder s=new StringBuilder ();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode n=q.poll();
            if(n==null)
            {
                s.append("null ");
                continue;
            }
            else
                s.append(n.val+" ");
                q.add(n.left);
                q.add(n.right);  
        }
        System.out.println(s.toString());
        return s.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0)
            return null;
          String ans[]=data.split(" ");
           // int count=0;
        TreeNode root =new TreeNode(Integer.parseInt(ans[0]));
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        int count=1;
        while(count<ans.length)
        {
            TreeNode temp=q.poll();
        
            if(!ans[count].equals("null"))
            {
                TreeNode left=new TreeNode (Integer.parseInt(ans[count]));
                temp.left=left;
                q.add(left);
            }
            count++;
             if(!ans[count].equals("null"))
            {
                TreeNode right=new TreeNode (Integer.parseInt(ans[count]));
                temp.right=right;
                q.add(right);
            }  
            count++;
        }
      return root;  
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));