// Last updated: 11/12/2025, 23:51:48
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        
5        int n = nums.length;
6
7        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3],
8                        nums[0] * nums[1] * nums[n - 1]);
9    }
10}