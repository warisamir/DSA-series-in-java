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
    public ListNode sortList(ListNode head) {
        if(head==null)
        return null;
 
    ListNode curr=head;
    ListNode ans=head;
    ArrayList<Integer> list=new ArrayList<>();
    while(curr!=null)
    {
        list.add(curr.val);
        curr=curr.next;
    }
      Collections.sort(list);
     for(Integer x: list)
    {
        ans.val=x;
        ans=ans.next;
    }
    
    return head;
    }
}