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
    public boolean isPalindrome(ListNode head) {
        if(head==null|| head.next ==null) return true;
        ListNode mid=middle(head);
        ListNode sec=reverse(mid.next);
        while(mid!=null && sec!=null){
            if(head.val!=sec.val)
                return false;
            head=head.next;
            sec=sec.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null,curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode middle(ListNode head){
        if(head==null)
         return head;
        ListNode fast=head,slow=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast==null)
            return prev;
        return slow;
    }
}