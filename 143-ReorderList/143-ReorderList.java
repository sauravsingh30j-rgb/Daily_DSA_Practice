// Last updated: 04/10/2025, 01:44:37

class Solution {
    public void reorderList(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            a.add(temp.val);
            temp = temp.next;
        }
        ArrayList<Integer> b = new ArrayList<>();
        int i = 0;
        int j = a.size() - 1;
        while (i < j) {
            b.add(a.get(i));
            b.add(a.get(j));
            i++;
            j--;
        }
        if (a.size() % 2 != 0) {
            b.add(a.get(a.size() / 2));
        }
        temp = head;
        int index = 0;
        while (temp != null) {
            temp.val = b.get(index);
            temp = temp.next;
            index++;
        }
    }
}
