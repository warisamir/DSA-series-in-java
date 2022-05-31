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
    public ListNode insertionSortList(ListNode head) {
        if(head==null)
        return null;
   
    ListNode curr=head;
    ListNode ans=head;
    
    //arraylist for copying  linked list element
    ArrayList<Integer> list=new ArrayList<>();
    
    // copy linkedlist element to arraylist
    while(curr!=null)
    {
        list.add(curr.val);
        curr=curr.next;
    }
    //sort arraylist
    Collections.sort(list);
    
    // copy element from arraylist to linked list
    for(Integer x: list)
    {
        ans.val=x;
        ans=ans.next;
    }
    
    return head;
    }
}