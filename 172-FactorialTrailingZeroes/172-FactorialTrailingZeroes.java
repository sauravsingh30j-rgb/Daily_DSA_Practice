// Last updated: 04/10/2025, 01:44:16
class Solution {
    public int trailingZeroes(int n) {
       int count = 0;
        while (n > 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}