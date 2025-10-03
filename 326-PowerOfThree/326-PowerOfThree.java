// Last updated: 04/10/2025, 01:43:21
class Solution {
    public boolean isPowerOfThree(int n) {
     
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 3 != 0) return false;
        return  isPowerOfThree(n / 3);
    }
}

    