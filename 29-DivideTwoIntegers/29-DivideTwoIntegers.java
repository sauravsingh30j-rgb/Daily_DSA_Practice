// Last updated: 20/08/2025, 23:12:12
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==-2147483648 && divisor==-1) return 2147483647;
        return dividend/divisor;
    }
}