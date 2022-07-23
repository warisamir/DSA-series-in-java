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
    public ListNode partition(ListNode head, int x) {
        ListNode high=new ListNode(0);
        ListNode low=new ListNode(0);
        ListNode l=low,h=high;
        while(head!=null){
            if(head.val<x){
                low.next=head;
                low=head;
            }
            else{
                high.next=head;
                high=head;
            }
        head=head.next;
        }
        high.next=null;
        low.next=h.next;
        return l.next;
    }
}