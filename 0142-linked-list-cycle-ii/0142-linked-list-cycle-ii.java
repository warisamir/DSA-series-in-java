/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
    
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
             break;   
        }
        if(fast==null ||fast.next==null)
            return null;
        ListNode cur=head,cur2=slow;
        while(cur!=cur2){
            cur=cur.next;
            cur2=cur2.next;
        }
        return cur;
    }
}
