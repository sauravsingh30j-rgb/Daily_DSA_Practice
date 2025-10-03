// Last updated: 04/10/2025, 01:43:19
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(0);
        ListNode a = even;
        ListNode odd = new ListNode(0);
        ListNode b = odd;
        int c = 0;
        ListNode temp = head;
        while (temp != null) {
            c++;
            if (c % 2 == 0) {
                a.next = new ListNode(temp.val);
                a = a.next;
            } else {
                b.next = new ListNode(temp.val);
                b = b.next;
            }
            temp = temp.next;
        }
        b.next=even.next;
        return odd.next;
    }
}