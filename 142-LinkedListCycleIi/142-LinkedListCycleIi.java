// Last updated: 04/10/2025, 01:44:47

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                {
                    while(slow!=fast)
                    {
                         slow = slow.next;
                         fast = fast.next;
                    }
                    return slow;

                }
            }
        }
        
        return null;
    }
}