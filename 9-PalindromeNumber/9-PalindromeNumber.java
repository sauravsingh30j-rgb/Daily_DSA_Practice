// Last updated: 04/10/2025, 01:46:48
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int originalNum = x;
        int value = 0;
        int rem;
        while (x > 0) {
            rem = x % 10;
            x = x / 10;
            value = value * 10 + rem;
        }
        if (value == originalNum) {
            return true;
        } else {
            return false;
        }
    }
}

