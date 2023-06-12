/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int find(ListNode a){
        int ct=0;
       while(a.next!=null){
           a=a.next;ct++;
       }
        return ct;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      int sizea=find(headA);
        int sizeb=find(headB);
        if(sizea>sizeb){
        for(int i=0;i<sizea-sizeb;i++)
        {
            headA=headA.next;
        }
        }
            else{
            for(int i=0;i<sizeb-sizea;i++){
                headB=headB.next;
            }    
            }
           while(headA!=headB){
               headA=headA.next;
               headB=headB.next;
           } 
        return headA;
  }
}