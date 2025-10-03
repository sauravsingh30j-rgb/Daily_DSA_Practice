// Last updated: 04/10/2025, 01:46:44
class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int j = i + 1;
            char sh = (j < s.length()) ? s.charAt(j) : ' ';
            
            if (ch == 'C' && sh == 'M') {
                sum += 900;
                i++;
            } else if (ch == 'M') {
                sum += 1000;
            } else if (ch == 'C' && sh == 'D') {
                sum += 400;
                i++;
            } else if (ch == 'D') {
                sum += 500;
            } else if (ch == 'X' && sh == 'C') { 
                sum += 90;
                i++;
            } else if (ch == 'C') {
                sum += 100;
            } else if (ch == 'X' && sh == 'L') {
                sum += 40;
                i++;
            } else if (ch == 'L') {
                sum += 50;
            } else if (ch == 'I' && sh == 'X') {
                sum += 9;
                i++;
            } else if (ch == 'X') {
                sum += 10;
            } else if (ch == 'I' && sh == 'V') { 
                sum += 4;
                i++;
            } else if (ch == 'V') {
                sum += 5;
            } else {
                sum += 1;
            }
        }
        return sum;
    }
}
