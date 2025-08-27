// Last updated: 27/08/2025, 23:21:38

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> a = new ArrayList<>();
        while (temp != null) {
            a.add(temp.val);
            temp = temp.next;
        }
         a.remove(a.size()/2);
        ListNode p = new ListNode(0);
        ListNode remp = p;
        for (int i = 0; i < a.size(); i++) {
            remp.next = new ListNode(a.get(i));
            remp = remp.next;
        }
        return p.next;
    }
}

        