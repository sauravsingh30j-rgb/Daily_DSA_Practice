// Last updated: 04/10/2025, 01:43:15
class Solution {
    public boolean isPowerOfFour(int n) {
     
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 4 != 0) return false;
        return  isPowerOfFour(n / 4);
    }
}

    