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
    public ListNode mergeKLists(ListNode[] ls) {
      if(ls==null ||ls.length==0)
          return null;
        PriorityQueue<ListNode>q=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode node:ls){
            if(node!=null)
                q.offer(node);
        }
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(!q.isEmpty()){
            ListNode node=q.poll();
            tail.next=node;
            tail=tail.next;
            if(node.next!=null)
                q.offer(node.next);
        }
        return dummy.next;
    }
}