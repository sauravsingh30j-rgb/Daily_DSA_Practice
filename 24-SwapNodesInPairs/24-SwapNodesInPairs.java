// Last updated: 04/10/2025, 01:46:29
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
    public ListNode swapPairs(ListNode head) {
      
if(head == null || head.next==null)
return head;
      ListNode current = head.next;
           head.next = swapPairs(head.next.next);
        current.next = head;
        return current;


    }
}