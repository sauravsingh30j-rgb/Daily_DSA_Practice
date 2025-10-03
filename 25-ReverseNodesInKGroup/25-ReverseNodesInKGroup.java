// Last updated: 04/10/2025, 01:46:27

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ArrayList<Integer> a = new ArrayList<>();
        while (temp != null) {
            a.add(temp.val);
            temp = temp.next;
        }
        ArrayList<Integer> b = new ArrayList<>();
        int i = 0;
        while (i + k <= a.size()) {
            int m = i + k - 1;
            while (m > i) {
                b.add(a.get(m));
                m--;
            }
            b.add(a.get(i));
            i = i + k;
        }
        int o = a.size() % k;
        for (int j = a.size() - o; j < a.size(); j++) {
            b.add(a.get(j));
        }
        ListNode remp = new ListNode(0);
        ListNode r = remp;
        int g = b.size();
        int j = 0;
        while (g > 0) {
            r.next = new ListNode(b.get(j));
            r = r.next;
            g--;
            j++;
        }
        return remp.next;
    }
}
