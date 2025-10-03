// Last updated: 04/10/2025, 01:44:26
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