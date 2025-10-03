// Last updated: 04/10/2025, 01:44:07
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode pre=null;
        ListNode curr=head;
        while(curr != null){
            ListNode temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }
        return pre;
    }
}