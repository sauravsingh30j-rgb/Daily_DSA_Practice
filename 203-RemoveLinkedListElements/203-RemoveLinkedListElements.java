// Last updated: 04/10/2025, 01:44:10
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp =head;
        ArrayList<Integer> a=new ArrayList<>();
        while(temp!=null)
        {
            a.add(temp.val);
            temp=temp.next;
        }
        for(int i=0;i<a.size();){
            if(a.get(i)==val)
            {
                a.remove(i);
            }else{
                i++;
            }
        }
        System.out.println(a);
        ListNode pappu=new ListNode(0);
        ListNode remp=pappu;
        int m=a.size();
        int i=0;
        while(m>0)
        {
            remp.next=new ListNode(a.get(i));
            remp=remp.next;
            i++;
            m--;
        }
        return pappu.next;
    }
}