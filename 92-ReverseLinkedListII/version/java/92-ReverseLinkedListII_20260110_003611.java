// Last updated: 10/01/2026, 00:36:11
1
2class Solution {
3    public ListNode reverseBetween(ListNode head, int left, int right) {
4        ListNode temp = head;
5        int count = 1;
6        ArrayList<Integer> a = new ArrayList<Integer>();
7        while (temp != null) {
8            a.add(temp.val);
9            temp = temp.next;
10            count++;
11        }
12        
13        ArrayList<Integer> b = new ArrayList<>();
14        for (int i = left - 1; i <= right - 1; i++) {
15            b.add(a.get(i));
16        }
17        Collections.reverse(b);
18        
19        int k = 0;
20        temp = head;
21        count = 1;
22        while (temp != null) {
23            if (count >= left && count <= right) {
24                temp.val = b.get(k);
25                k++;
26            }
27            temp = temp.next;
28            count++;
29        }
30        return head;
31    }
32}
33