// Last updated: 15/06/2026, 23:19:15
1
2class Solution {
3    public ListNode deleteMiddle(ListNode head) {
4        ListNode temp = head;
5        ArrayList<Integer> a = new ArrayList<>();
6        while (temp != null) {
7            a.add(temp.val);
8            temp = temp.next;
9        }
10         a.remove(a.size()/2);
11        ListNode p = new ListNode(0);
12        ListNode remp = p;
13        for (int i = 0; i < a.size(); i++) {
14            remp.next = new ListNode(a.get(i));
15            remp = remp.next;
16        }
17        return p.next;
18    }
19}
20
21        