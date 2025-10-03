// Last updated: 04/10/2025, 01:42:05
import java.util.*;
class Solution {
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
    for(ListNode curr=head;curr!=null;curr=curr.next)
    {
         arr.add(curr.val);
    }
    Collections.reverse(arr);
    int c=0;
    int sum=0;
    for(int i=0;i<arr.size();i++)
    {
      if(arr.get(i)==1)
      {
        sum=sum+(int)Math.pow(2,c);
        c++;
      }
      else
      {
        c++;
      }

    }
        return sum;
    }
}