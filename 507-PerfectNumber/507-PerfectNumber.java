// Last updated: 04/10/2025, 01:42:43
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) sum += num / i;
            }
        }
        
        return sum == num;
    }
}

