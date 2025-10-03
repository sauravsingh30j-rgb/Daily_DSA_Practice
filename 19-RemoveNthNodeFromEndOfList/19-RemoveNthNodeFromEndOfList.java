// Last updated: 04/10/2025, 01:46:36
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int c = 0;
        while (curr != null) {
            c++;
            curr = curr.next; 
        }
        if (c == n) {
            return head.next; 
        }
        curr = head; 
        int k = 0;
        while (k < c- n - 1 ) {
            curr = curr.next; 
            k++;
        }
        curr.next = curr.next.next;
        return head; 
        }
}
