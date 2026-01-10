// Last updated: 10/01/2026, 23:55:28
1class Solution {
2    public int[] sumZero(int n) {
3        int ans[]=new int[n];
4        int start=-n/2;
5        int idx=0;
6        if(n%2==1) {
7            for(int i=0; i<n; i++) {
8                ans[idx++]=start++;
9            }
10        } else {
11            for(int i=0; i<=n; i++) {
12                if(start==0) {
13                    start++;
14                    continue;
15                }
16                ans[idx++]=start++;
17            }
18        }
19        return ans;
20    }
21}