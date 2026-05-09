// Last updated: 09/05/2026, 22:47:11
1class Solution {
2    public ListNode reverseList(ListNode head) {
3        ListNode temp = head;
4        ArrayList<Integer> a = new ArrayList<>();
5              
6
7
8                     
9                                      
10
11              
12
13
14                   
15        while(temp != null) {         
16            a.add(temp.val);
17            temp = temp.next;
18        }
19        
20        Collections.reverse(a);
21        temp = head;
22        int i = 0;
23        while (temp != null) {
24            temp.val = a.get(i++);
25            temp = temp.next;
26        }
27        
28        return head;
29    }
30}