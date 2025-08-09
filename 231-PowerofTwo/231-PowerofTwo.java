// Last updated: 09/08/2025, 22:23:08
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        return  isPowerOfTwo(n / 2);
    }
}
