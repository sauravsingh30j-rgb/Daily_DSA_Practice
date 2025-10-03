// Last updated: 04/10/2025, 01:44:50

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow =head;
        boolean ans=false;
        
        if(head==null ||  head.next==null) return ans;
         while (fast.next != null && fast.next.next != null) 
        {   fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {   ans=true;
                return ans;
            }
           
        }
        return ans;
        
    }
}