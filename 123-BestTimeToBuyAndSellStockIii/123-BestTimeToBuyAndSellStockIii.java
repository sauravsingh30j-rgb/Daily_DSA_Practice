// Last updated: 04/10/2025, 01:44:56
public class Solution {
    public int maxProfit(int[] prices) {
        int b1 = Integer.MIN_VALUE, s1 = 0, b2 = Integer.MIN_VALUE, s2 = 0;
        for (int p : prices) {
            b1 = Math.max(b1, -p);
            s1 = Math.max(s1, b1 + p);
            b2 = Math.max(b2, s1 - p);
            s2 = Math.max(s2, b2 + p);
        }
        return s2;
    }
}
