// Last updated: 27/08/2025, 23:21:36
class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head==null) return null;
        ListNode temp = head;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        while(temp!=null){
            a.add(temp.val);
            temp=temp.next;
        }
        int max=Integer.MIN_VALUE;
        for(int i=a.size()-1;i>=0;i--){
                if(a.get(i)>=max){
                    ans.add(a.get(i));
                    max=a.get(i);
                }
        }
        System.out.println(ans);
        Collections.reverse(ans);
        ListNode nn = new ListNode(0);
        ListNode remp = nn;
        int p = ans.size();
        int i = 0;
        while (p > 0) {
            remp.next = new ListNode(ans.get(i));
            remp = remp.next;
            i++;
            p--;
        }
        return nn.next;
    }
}


 