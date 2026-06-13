// Last updated: 13/06/2026, 14:09:33
1class Solution {
2    public List<Integer> getRow(int n) {
3      List<List<Integer>> a= new ArrayList<>();
4      for(int i=0;i<n+1;i++)
5      {
6         List<Integer> b= new ArrayList<>();
7          for(int j=0;j<=i;j++)
8          {
9            if(j==0|| j==i)
10            {
11                b.add(1);
12            }
13            else
14            {
15              b.add(a.get(i-1).get(j-1)+a.get(i-1).get(j));
16            }
17          }
18          a.add(b);
19      }
20      return a.get(n);
21    }
22}