// Last updated: 04/10/2025, 01:45:56
class Solution {
    public boolean canJump(int[] arr) {
        int maxReach = 0; // Initialize maximum reachable index
        for (int i = 0; i < arr.length; i++) {
            if (i > maxReach) { // If current index is greater than max reachable index
                return false;
            }
            maxReach = Math.max(maxReach, i + arr[i]); // Update max reachable index
            if (maxReach >= arr.length - 1) { // If we can reach or exceed the last index
                return true;
            }
        }
        return false;
    }
}
