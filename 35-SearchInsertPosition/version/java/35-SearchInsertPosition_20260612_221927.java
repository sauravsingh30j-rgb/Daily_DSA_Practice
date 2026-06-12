// Last updated: 12/06/2026, 22:19:27
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int ans=-1;
4        if(target>nums[nums.length-1])
5        {
6            return nums.length;
7    }
8        for(int i=0;i<nums.length;i++)
9        {
10            if(nums[i]>=target)
11            {
12                ans=i;
13                break;
14            }
15        }
16        return ans;
17    }
18}