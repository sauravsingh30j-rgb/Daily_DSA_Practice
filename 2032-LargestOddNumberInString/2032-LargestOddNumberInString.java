// Last updated: 27/08/2025, 23:21:42
class Solution {
    public String largestOddNumber(String num) {
        String k="";
        int s=-1;
       
       for(int i=num.length()-1;i>=0;i--)
             {
                int n=num.charAt(i)-'0';
                if (n%2!=0)
                {
                    s=i;
                    break;
                }
             }
      return num.substring(0,s+1);
    }
}