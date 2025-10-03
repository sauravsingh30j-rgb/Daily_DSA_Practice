// Last updated: 04/10/2025, 01:43:43
class Solution {
    public int addDigits(int num) {
        while (num >9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
