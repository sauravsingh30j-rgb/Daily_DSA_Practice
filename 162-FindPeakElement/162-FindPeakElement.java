// Last updated: 04/10/2025, 01:44:20
class Solution {
    public int findPeakElement(int[] nums) {
        int max=nums[0];
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                ans=i;
            }
        }
    return ans;
    }
}