// Last updated: 21/10/2025, 20:40:50
class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        
        boolean isNegative = num < 0;
        if (isNegative) num = -num;
        
        int value = 0;
        int pow = 0;
        while (num > 0) {
            int rem = num % 7;
            num /= 7;
            value += rem * (int) Math.pow(10, pow);
            pow++;
        }
        
        String s = String.valueOf(value);
        return isNegative ? "-" + s : s;
    }
}
