// Last updated: 24/12/2025, 21:26:33
1class Solution {
2    public int findGCD(int[] nums) {
3        int min = nums[0], max = nums[0];
4        for (int x : nums) {
5            min = Math.min(min, x);
6            max = Math.max(max, x);
7        }
8
9        int ans = 1;
10        for (int i = 1; i <= min; i++) {
11            if (min % i == 0 && max % i == 0) {
12                ans = i;
13            }
14        }
15
16        return ans;
17    }
18}