// Last updated: 04/10/2025, 01:45:32

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        ListNode temp = head;
        
        while (temp != null) {
            if (!set.add(temp.val)) {
                duplicates.add(temp.val);
            }
            temp = temp.next;
        }
        
        temp = head;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (temp != null) {
            if (!duplicates.contains(temp.val)) {
                current.next = new ListNode(temp.val);
                current = current.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}
