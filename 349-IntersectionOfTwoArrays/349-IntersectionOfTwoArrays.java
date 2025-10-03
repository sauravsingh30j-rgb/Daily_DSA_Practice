// Last updated: 04/10/2025, 01:43:09
import java.util.*;
class Solution {
    public int[] intersection(int[] arr, int[] arr1) {
        Arrays.sort(arr);
        Arrays.sort(arr1);
        Set<Integer> resultSet = new HashSet<>();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int p = 0; p < arr1.length; p++) {
                if (arr[i] == arr1[p]) {
                    resultSet.add(arr[i]);
                    break; 
                }
            }
        }
        int[] nums = new int[resultSet.size()];
        for (int num : resultSet) {
            nums[j++] = num;
        }
        return nums;
    }
}
