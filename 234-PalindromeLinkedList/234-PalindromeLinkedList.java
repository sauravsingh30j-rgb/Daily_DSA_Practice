// Last updated: 04/10/2025, 01:43:49
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            a.add(temp.val);
            temp = temp.next;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int k = a.size() - 1;
        while (k >= 0) {
            arr.add(a.get(k));
            k--;
        }
        return a.equals(arr);
    }
}
