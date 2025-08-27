// Last updated: 27/08/2025, 23:21:41

import java.util.*;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = 2 * nums.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            if (i < nums.length) {
                arr[i] = nums[i];
            } else {
                arr[i] = nums[i - nums.length];
            }
        }
        return arr;
    }
}
