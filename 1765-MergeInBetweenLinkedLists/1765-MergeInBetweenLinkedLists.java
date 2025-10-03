// Last updated: 04/10/2025, 01:41:59

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        ListNode remp = list2;
        ListNode pappu = new ListNode(0);
        ListNode c = pappu;
        int count = 0;
        while (temp != null) {
            if (count < a || count > b) {
                c.next = new ListNode(temp.val);
                c = c.next;
                temp = temp.next;
                count++;
            } else {
                if (count == a) {
                    while (remp != null) {
                        c.next = new ListNode(remp.val);
                        c = c.next;
                        remp = remp.next;
                    }
                }
                temp = temp.next;
                count++;
            }
        }
        return pappu.next;
    }
}
