// Last updated: 04/09/2025, 10:40:49
// peak element
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