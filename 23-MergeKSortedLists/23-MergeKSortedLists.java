// Last updated: 04/10/2025, 01:46:30
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<lists.length;i++)
        {
            ListNode curr=lists[i];
            while(curr!=null)
            {
                a.add(curr.val);
                curr=curr.next;
            }
        }
        Collections.sort(a);
        ListNode head=new ListNode(0);
        ListNode pappu=head;
        int m=a.size();
        int p=0;
        while(p<m)
        {
            pappu.next = new ListNode(a.get(p));

            pappu=pappu.next;
            p++;
        }
       
        return head.next;
    }
}