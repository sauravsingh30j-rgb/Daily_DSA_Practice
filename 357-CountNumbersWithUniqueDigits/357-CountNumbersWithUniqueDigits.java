// Last updated: 04/10/2025, 01:43:04
import java.util.*;
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
              if (n == 0) return 1;
        int count = 10, unique = 9;
        for (int i = 2; i <= n; i++) {
            unique *= (11 - i);
            count += unique;
        }
        return count;
    }
}
