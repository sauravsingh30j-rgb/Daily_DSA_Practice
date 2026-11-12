// Last updated: 12/11/2026, 20:54:21
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int arr[]=new int[2];
4                for(int i=0;i<nums.length;i++)
5        {
6            for(int j=i+1;j<nums.length;j++)
7            {
8                if(nums[i]+nums[j]==target)
9                {
10                   arr[0]=i;
11                   arr[1]=j;
12                    break;
13                }
14            }
15        }
16        return arr;
17    }
18}