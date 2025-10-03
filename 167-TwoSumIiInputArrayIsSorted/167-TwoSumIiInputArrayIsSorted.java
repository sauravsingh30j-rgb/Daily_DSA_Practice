// Last updated: 04/10/2025, 01:44:19
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int arr[]=new int[2];
        int j=nums.length-1;
        while(i<j)
        {  int sum=nums[i]+nums[j];
            if(sum==target)
            {
                arr[0]=i+1;
                arr[1]=j+1;
                break;
            }
            else if (sum<target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return  arr;
    }
}