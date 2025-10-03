// Last updated: 04/10/2025, 01:46:16
class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
                
            }
        }
        return -1;
    }
}