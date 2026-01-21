// Last updated: 22/01/2026, 00:37:24
1
2class Solution {
3    public int singleNumber(int[] nums) {
4        Arrays.sort(nums);
5        int ans = 0;
6        HashSet<Integer> a = new HashSet<>();
7        for (int i : nums) {
8            a.add(i);
9        }
10        int count = 0;
11        for (int k : a) {
12            count = 0;
13            for (int l = 0; l < nums.length; l++) {
14                if (k == nums[l]) {
15                    count++;
16                }
17            }
18            if (count == 1) {
19                ans = k;
20            }
21        }
22        return ans;
23    }
24}
25