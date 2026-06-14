// Last updated: 14/06/2026, 22:20:27
1class Solution {
2    public int maximumCount(int[] num) {
3        int p=0;int n=0;
4        for(int i=0;i<num.length;i++)
5        {
6                         if(num[i]>0)
7                         {
8                            p++;
9                         }
10                         if(num[i]<0)
11                         {
12                            n++;
13                         }
14        }
15        if(p>n)
16        {
17            return p;
18        }
19        return n;
20    }
21}