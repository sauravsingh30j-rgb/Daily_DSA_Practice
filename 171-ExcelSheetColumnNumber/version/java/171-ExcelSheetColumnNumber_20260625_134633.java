// Last updated: 25/06/2026, 13:46:33
1class Solution {
2    public int titleToNumber(String s) {
3        int sum=0;
4        for(int i=0;i<s.length();i++)
5        {   char pres=s.charAt(i);
6        int val=pres-'A'+1;
7            sum=sum*26+val;
8        }
9        return sum;
10    }
11}