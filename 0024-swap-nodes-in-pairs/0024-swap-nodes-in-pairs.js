/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var swapPairs = function(head) {
  let curr=head;
    while(curr && curr.next){
        [curr.val,curr.next.val]=[curr.next.val,curr.val];
        curr=curr.next.next;
    }
    return head;
};