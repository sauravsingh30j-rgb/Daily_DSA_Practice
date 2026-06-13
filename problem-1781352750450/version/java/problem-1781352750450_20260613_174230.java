// Last updated: 13/06/2026, 17:42:30
1class Solution {
2    public int thirdMax(int[] nums) {
3        HashSet<Integer> a=new HashSet<>();
4        for(int i:nums)
5        {
6            a.add(i);
7        }
8        ArrayList<Integer> b=new ArrayList<>(a);
9       Collections.sort(b);
10       if(b.size()==1)
11       {
12        return b.get(0);
13       }
14       if(b.size()==2)
15       {
16        return b.get(1);
17       }
18       if(b.size()==1)
19       {
20        return b.get(2);
21       }
22       return b.get(b.size()-3);
23    }
24}