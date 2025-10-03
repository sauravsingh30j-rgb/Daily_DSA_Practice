// Last updated: 04/10/2025, 01:44:51

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        HashSet<Integer> a = new HashSet<>();
        for (int i : nums) {
            a.add(i);
        }
        int count = 0;
        for (int k : a) {
            count = 0;
            for (int l = 0; l < nums.length; l++) {
                if (k == nums[l]) {
                    count++;
                }
            }
            if (count == 1) {
                ans = k;
            }
        }
        return ans;
    }
}
