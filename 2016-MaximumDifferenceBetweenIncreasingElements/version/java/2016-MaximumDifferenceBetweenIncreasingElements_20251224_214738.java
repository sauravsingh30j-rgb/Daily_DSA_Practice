// Last updated: 24/12/2025, 21:47:38
1public class Solution {
2    public int maximumDifference(int[] nums) {
3        int ans = -1;
4        for (int i = 0; i < nums.length - 1; i++) {
5            for (int j = i + 1; j < nums.length; j++) {
6                if (nums[i] < nums[j]) {
7                    ans = Math.max(ans, nums[j] - nums[i]);
8                }
9            }
10        }
11        return ans;
12    }
13}