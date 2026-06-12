// Last updated: 12/06/2026, 22:50:45
1class Solution {
2    public int[] plusOne(int[] d) {
3        ArrayList<Integer> a = new ArrayList<>();
4
5        int c = 1;
6        int f, l;
7
8        for (int i = d.length - 1; i >= 0; i--) {
9            f = d[i] + c;
10            c = f / 10;
11            l = f % 10;
12            a.add(l);
13        }
14
15        if (c > 0) {
16            a.add(c);
17        }
18
19        Collections.reverse(a);
20
21        int[] ans = new int[a.size()];
22
23        for (int i = 0; i < a.size(); i++) {
24            ans[i] = a.get(i);
25        }
26
27        return ans;
28    }
29}