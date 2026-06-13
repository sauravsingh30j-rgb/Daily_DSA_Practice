// Last updated: 13/06/2026, 17:44:24
1class Solution {
2    public int missingNumber(int[] nums) {
3        
4            Arrays.sort(nums);if(nums[0]!=0)
5        {
6            return 0;
7        }
8            for(int i=0;i<nums.length-1;i++)
9            {
10                if(nums[i]+1!=nums[i+1])
11                {
12                    return nums[i]+1;
13                }
14            }
15            return nums[nums.length-1]+1;
16    }
17}