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
    public ListNode swapNodes(ListNode head, int k) {
        k=k-1;
        ListNode h1=head,h2=head,h4;
        while(k>0){
            h1=h1.next;
            k--;
        }
      h4=h1;
        ListNode h3=head;
        while(h1.next!=null){
            h1=h1.next;
            h3=h3.next;
        }
        int valu=h3.val;
        h3.val=h4.val;
        h4.val=valu;
        return head;
    }
}