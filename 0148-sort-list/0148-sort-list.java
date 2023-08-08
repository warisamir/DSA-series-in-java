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
 public ListNode getMid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public ListNode merge(ListNode list1,ListNode list2)
    {
        ListNode dummy=new ListNode(-1);
        ListNode curr1=list1;
        ListNode curr2=list2;
        ListNode res=dummy;

        while(curr1!=null && curr2!=null)
        {
            if(curr2.val>=curr1.val)
            {
                dummy.next=curr1;
                dummy=dummy.next;
                curr1=curr1.next;
            }
            else{
                dummy.next=curr2;
                dummy=dummy.next;
                curr2=curr2.next;
            }
        }
        if(curr1!=null)
        {
            dummy.next=curr1;
        }
        else{
            dummy.next=curr2;
        }

        return res.next;
    }

    public ListNode sortList(ListNode head) {

        if(head==null || head.next==null)
        {
            return head;
        }

        ListNode mid=getMid(head);

        ListNode left=head;

        ListNode right=mid.next;

        mid.next=null;

        left=sortList(left);
        right=sortList(right);

        ListNode mergedList=merge(left,right);

        return mergedList;
    }
}