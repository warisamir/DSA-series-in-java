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
//     TreeNode f;
//     TreeNode s;
//     TreeNode pre;
    
    // public void inorder(TreeNode root){
    //     if(root==null) return ;
    //     inorder(root.left);
    //     if(pre==null){
    //         pre=root;
    //     }else{
    //         if(root.val<pre.val){
    //             if(f==null){
    //                 f=pre;
    //             }
    //             s=root;
    //         }
    //         pre=root;
    //     }
    //     inorder(root.right);
    // }
    public void recoverTree(TreeNode root) {
        TreeNode curr=root;
        TreeNode prev=null,n1=null,n2=null;
        while(curr!=null){
            if(curr.left==null){
                if(prev!=null){
                    if(curr.val<prev.val){
                       if(n1==null)
                       {   n1=prev;
                        n2=curr;
                       }
                        else{
                            n2=curr;
                        }
                    }
                }
                prev=curr;
                curr=curr.right; 
            }
            else{
                TreeNode iop=curr.left;
                while(iop.right!=null && iop.right!=curr){
                    iop=iop.right;
                }
                if(iop.right==null){
                    iop.right=curr;
                    curr=curr.left;
                }
                else{
                    
                    if(prev!=null){
                        if(prev.val>curr.val){
                            if(n1==null){
                                n1=prev;
                                n2=curr;
                            }
                            else{
                                n2=curr;
                            }
                        }
                    }
                    prev=curr;
                    iop.right=null;
                    curr=curr.right;
                }
            }
        }
            int temp=n1.val;
            n1.val=n2.val;
            n2.val=temp;
        }
    }
        
        
        
        
        
        
    //     if(root==null) return ;
    //     inorder(root);
    //     if(s!=null && f!=null){
    //         int val=s.val;
    //         s.val=f.val;
    //         f.val=val;
    //     }
    // }
