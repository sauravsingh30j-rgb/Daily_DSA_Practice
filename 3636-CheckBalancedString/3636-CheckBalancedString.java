// Last updated: 27/08/2025, 23:21:23
class Solution {
    public boolean isBalanced(String num) {
       int odd=0;         
       int even=0;
       Boolean ans=false;
       for(int i=0;i<num.length();i++)
       {
        int l = num.charAt(i) - '0';
       if(i%2==0)
       {
       even=even+l;
       }
       if(i%2!=0)
       {
       odd=odd+l;
       }
       }
       if(even==odd)
       {
        ans=true;
       }
       System.out.println(odd);
       System.out.print(even);
       return ans;
    }
}