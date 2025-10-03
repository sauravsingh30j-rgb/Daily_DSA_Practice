// Last updated: 04/10/2025, 01:44:25
class Solution {
    public int findMin(int[] nums) {
         int min=99999;
        if(nums.length==1)
    {
        return nums[0];
    }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        return min;
    }
}