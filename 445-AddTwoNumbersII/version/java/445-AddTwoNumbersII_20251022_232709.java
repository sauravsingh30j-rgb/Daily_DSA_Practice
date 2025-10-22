// Last updated: 22/10/2025, 23:27:09

import java.util.ArrayList;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }
        
        java.util.Collections.reverse(list1);
        java.util.Collections.reverse(list2);
        
        int carry = 0;
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() || j < list2.size() || carry > 0) {
            int x = (i < list1.size()) ? list1.get(i) : 0;
            int y = (j < list2.size()) ? list2.get(j) : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            result.add(sum % 10);
            i++;
            j++;
        }
         java.util.Collections.reverse(result);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : result) {
            current.next = new ListNode(val);
            current = current.next;
        }
        
        return dummy.next;}}
