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
    public ListNode removeNodes(ListNode head) {
      if(head.next==null)return head;
        ListNode node=removeNodes(head.next);
        if(node.val>head.val)return node;
        head.next=node;
            return head;
    }
}