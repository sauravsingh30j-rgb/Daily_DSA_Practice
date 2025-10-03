// Last updated: 04/10/2025, 01:45:59
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
             max=Math.max(sum,max);
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
}