// Last updated: 27/08/2025, 23:21:25
import java.util.*;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head)
     {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy;

        while(curr.next!=null){
            if(set.contains(curr.next.val)){
               curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
       
        return dummy.next;

     }
}
//     { int n1=nums.length;
//         ArrayList <Integer>arr=new ArrayList<>(); 
//     for(ListNode curr=head;curr!=null;curr=curr.next) 
//     {
//          arr.add(curr.val); 
//          }
//         int n=arr.size();
//      for(int i=0;i<n1;i++)
//       {
//          for(int j=0;j<n;j++)
//        { 
//         if(nums[i]==arr.get(j)) {
//         arr.remove(j); 
//        j--;
//        n--;
//        } 
//        }}
//     ListNode dummy = new ListNode(0);
// ListNode curr = dummy;
// for (int val : arr) {
//     curr.next = new ListNode(val);
//     curr = curr.next;
// }
// return dummy.next;






//         }}