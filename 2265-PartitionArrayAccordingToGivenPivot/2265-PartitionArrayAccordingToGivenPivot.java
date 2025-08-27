// Last updated: 27/08/2025, 23:21:37
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int m = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                arr[m++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                arr[m++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                arr[m++] = nums[i];
            }
        }

        return arr;
    }
}
