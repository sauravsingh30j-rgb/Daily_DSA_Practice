// Last updated: 24/09/2025, 01:42:58
class Solution {
    public int countDigitOne(int n) {
        long res = 0;
        long i = 1;
        while (i <= n) {
            long divider = i * 10;
            res += (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0), i);
            i *= 10;
        }
        return (int) res;
    }
}
