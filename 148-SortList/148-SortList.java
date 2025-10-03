// Last updated: 04/10/2025, 01:44:31
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> a = new ArrayList<>();
        while (temp != null) {
            a.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(a);
        ListNode p = new ListNode(0);
        ListNode remp = p;
        for (int i = 0; i < a.size(); i++) {
            remp.next = new ListNode(a.get(i));
            remp = remp.next;
        }
        return p.next;
    }
}
