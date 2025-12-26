// Last updated: 26/12/2025, 21:25:15
1class Solution {
2    public int findNthDigit(int n) {
3        int len = 1;
4        long count = 9;
5        int start = 1;
6        
7        while (n > len * count) {
8            n -= len * count;
9            len++;
10            count *= 10;
11            start *= 10;
12        }
13        
14        start += (n - 1) / len;
15        String s = Integer.toString(start);
16        return s.charAt((n - 1) % len) - '0';
17    }
18}