// Last updated: 13/06/2026, 16:09:27
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3       for(int i=0;i<nums.length;i++) 
4       {
5        for(int j=i+1;j<nums.length && Math.abs(i-j)<=k;j++)
6        {
7            if(nums[i]==nums[j] )
8            {
9                return true;
10            }
11        }
12       }
13       return false;
14    }
15}