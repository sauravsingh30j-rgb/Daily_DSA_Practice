// Last updated: 14/05/2026, 22:15:04
1import java.util.Arrays;
2
3class Solution {
4    public boolean isGood(int[] nums) {
5        int n = nums.length;
6
7        Arrays.sort(nums);
8
9        for (int i = 0; i < n - 1; i++) {
10            if (nums[i] != i + 1) {
11                return false;
12            }
13        }
14
15        return nums[n - 1] == n - 1;
16    }
17}