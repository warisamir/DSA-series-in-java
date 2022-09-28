/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode temp=head,dummy=head;
   
        if(temp.next==null)return null;
        int k=n;
        while(n>0){
            temp=temp.next;
            n--;
        }
        if(temp==null)
            return head.next;
        while(temp.next!=null){
            temp=temp.next;
            dummy=dummy.next;
        }
        dummy.next=dummy.next.next;
        return head;
    }
    
}