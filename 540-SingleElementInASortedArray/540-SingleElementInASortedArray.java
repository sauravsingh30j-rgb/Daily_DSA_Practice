// Last updated: 04/10/2025, 01:42:40

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        int ans = -1;
        if(nums.length==1)
        {
            return nums[0];
        }
        while (i < nums.length) {
            if (i == 0) {
                if (nums[i] == nums[i + 1]) {
                    i += 2;
                } else {
                    ans = nums[i];
                    break;
                }
            } else if (i == nums.length - 1) {
                ans = nums[i];
                break;
            } else if (nums[i] == nums[i - 1]) {
                i += 1;
            } else if (nums[i] == nums[i + 1]) {
                i += 2;
            } else {
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}
