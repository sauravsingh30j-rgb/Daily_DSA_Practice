// Last updated: 20/01/2026, 19:49:19
1class Solution {
2
3    private static final int MOD = 1337;
4
5    public int superPow(int a, int[] b) {
6        a %= MOD;          // reduce base
7        int res = 1;       // identity for multiplication
8
9        for (int digit : b) {
10            // res = res^10 * a^digit % MOD
11            res = pow(res, 10);
12            res = (res * pow(a, digit)) % MOD;
13        }
14
15        return res;
16    }
17
18    // Binary exponentiation using  approach:
19    // - if power is odd -> subtract 1
20    // - if power is even -> divide by 2 and square base
21    private int pow(int x, int n) {
22        long m = n;
23        int ans = 1;
24        x %= MOD;
25
26        while (m > 0) {
27            if (m % 2 == 1) {      // odd power
28                ans = (ans * x) % MOD;
29                m = m - 1;
30            } else {               // even power
31                x = (x * x) % MOD;
32                m = m / 2;
33            }
34        }
35
36        return ans;
37    }
38}