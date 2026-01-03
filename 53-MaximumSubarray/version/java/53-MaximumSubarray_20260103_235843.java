// Last updated: 03/01/2026, 23:58:43
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int sum=0;
4        int max = Integer.MIN_VALUE;
5        for(int i=0;i<nums.length;i++)
6        {
7            sum=sum+nums[i];
8             max=Math.max(sum,max);
9            if(sum<0)
10            {
11                sum=0;
12            }
13        }
14        return max;
15    }
16}