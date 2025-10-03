// Last updated: 04/10/2025, 01:43:56
import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i < n && arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > n / 3) {
                    list.add(arr[i - 1]);
                }
                count = 1;
            }
        }
        return list;
    }
}
