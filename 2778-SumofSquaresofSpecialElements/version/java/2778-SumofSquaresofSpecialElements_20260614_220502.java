// Last updated: 14/06/2026, 22:05:02
1class Solution {
2    public int sumOfSquares(int[] nums) {
3        int sum=0;
4       
5        for(int i=0;i<nums.length;i++)
6        {
7           if(nums.length % (i+1) ==0)
8           {
9            sum=sum+(nums[i]*nums[i]);
10           }
11        }
12        return sum;
13    }
14}