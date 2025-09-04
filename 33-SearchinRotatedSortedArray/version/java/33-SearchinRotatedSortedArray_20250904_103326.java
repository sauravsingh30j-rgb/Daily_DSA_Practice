// Last updated: 04/09/2025, 10:33:26
// search in rotated sorted array
class Solution {
    public int search(int[] nums, int target) {
         for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // target mil gaya
            }
        }
        return -1; // target nahi mila
    }
}