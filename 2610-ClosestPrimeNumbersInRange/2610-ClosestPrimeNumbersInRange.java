// Last updated: 27/08/2025, 23:21:34
import java.util.ArrayList;

class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] a = new int[2];
        a[0] = -1;
        a[1] = -1;
        for (int i = left; i <= right; i++) {
            if (prime(i) == 1) {
                arr.add(i);
            }
        }
        if (arr.size() < 2) {
            return a;
        }
        int[] b = new int[2];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.size(); i++) {
            int diff = arr.get(i) - arr.get(i - 1);
            if (diff < min) {
                min = diff;
                b[0] = arr.get(i - 1);
                b[1] = arr.get(i);
            }
        }
        return b;
    }

    public int prime(int n) {
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
