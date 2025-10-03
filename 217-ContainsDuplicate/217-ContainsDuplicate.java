// Last updated: 04/10/2025, 01:44:02
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
            for(int i=1;i<nums.length;i++)
            {
              if(nums[i]==nums[i-1])
              {
                return true;
              
              }
            }
            return false;
    }
}