// Last updated: 04/10/2025, 01:46:57
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        int rem = 0;
        int sum;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int a;
            int b;
            if (l1 != null) { 
                a = l1.val;
            } else {
                a = 0;
            }
            if (l2 != null) {
                b = l2.val;
            } else {
                b = 0;
            }
            sum = a + b + carry;
            carry = sum / 10;
            rem = sum % 10;
            l3.next = new ListNode(rem); 
            l3 = l3.next; 

            if (l1 != null) l1 = l1.next; 
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            l3.next = new ListNode(carry);
        }

        return dummy.next; 
    }
}
