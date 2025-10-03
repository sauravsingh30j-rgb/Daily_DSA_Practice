// Last updated: 04/10/2025, 01:46:14
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1}; 
        if (nums.length == 0) {
            return arr;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[0] = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                arr[1] = i;
                break;
            }
        }

        return arr;
    }
}