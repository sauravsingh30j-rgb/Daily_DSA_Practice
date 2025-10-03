// Last updated: 04/10/2025, 01:44:28
class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(nums[i], max * nums[i]), min * nums[i]);
            min = Math.min(Math.min(nums[i], temp * nums[i]), min * nums[i]);
            
            result = Math.max(result, max);
        }
        
        return result;
    }
}
