// Last updated: 04/09/2025, 10:35:41
// minimum in rotated sorted array
class Solution {
    public int findMin(int[] nums) {
        if(nums.length==0)
        {
            return -1;
        }
      Arrays.sort(nums);
      return nums[0];
    }
}