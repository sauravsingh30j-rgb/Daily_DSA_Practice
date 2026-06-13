// Last updated: 13/06/2026, 14:57:23
1class Solution {
2    public List<Integer> getRow(int n) {
3        List<List<Integer>> a=new ArrayList<>();
4        for(int i=0;i<n+1;i++)
5        {List<Integer> b=new ArrayList<>();
6            for(int j=0;j<=i;j++)
7            {
8                if(j==0 || j==i)
9                {
10                    b.add(1);
11                }
12                else
13                {
14                    b.add(a.get(i-1).get(j-1) + a.get(i-1).get(j));
15                }
16            }
17            a.add(b);
18        }
19        return a.get(n);
20    }
21}