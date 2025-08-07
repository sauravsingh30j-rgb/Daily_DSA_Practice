// Last updated: 07/08/2025, 23:56:06

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        int count = 1;
        ArrayList<Integer> a = new ArrayList<Integer>();
        while (temp != null) {
            a.add(temp.val);
            temp = temp.next;
            count++;
        }
        
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = left - 1; i <= right - 1; i++) {
            b.add(a.get(i));
        }
        Collections.reverse(b);
        
        int k = 0;
        temp = head;
        count = 1;
        while (temp != null) {
            if (count >= left && count <= right) {
                temp.val = b.get(k);
                k++;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }
}
