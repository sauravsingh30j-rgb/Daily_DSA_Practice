// Last updated: 14/06/2026, 22:13:35
1class Solution {
2    public int countSeniors(String[] nums) {
3        int c=0;
4        for(int i=0;i<nums.length;i++)
5        {
6            String s=nums[i];
7            int age=(s.charAt(11)-'0')*10+(s.charAt(12)-'0');
8            if(age>60)
9            {
10                c++;
11            }
12        }
13        return c;
14    }
15}