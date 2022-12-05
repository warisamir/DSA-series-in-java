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
    public int pairSum(ListNode head) {
        ListNode dummy= head;
       
        ListNode temp=getMiddle(head);
        ListNode rev=reverse(temp.next);
        int ans=0;
        while(rev!=null){
            ans=Math.max(ans,rev.val+dummy.val);
            dummy=dummy.next;
            rev=rev.next;
        }
        return ans;
    }
    public ListNode getMiddle(ListNode head){
            ListNode slow = head, fast = head, prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null) return prev;
        return slow;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        
        while(curr != null) {
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
}