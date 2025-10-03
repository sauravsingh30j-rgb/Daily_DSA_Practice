// Last updated: 04/10/2025, 01:46:08
class Solution {
  public int firstMissingPositive(int[] nums) {
    Arrays.sort(nums);
    int ans = 1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == ans) {
        ans++;
      }
    }
    return ans;
  }
}
