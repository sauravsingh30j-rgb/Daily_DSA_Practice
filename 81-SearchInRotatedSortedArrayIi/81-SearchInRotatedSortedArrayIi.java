// Last updated: 04/10/2025, 01:45:33
class Solution {
    public boolean search(int[] nums, int target) {
        {
            for (int i :nums) {
                if (i == target) {
                    return true;
                }
            }
        }
        return false;
    }
}