// Last updated: 27/08/2025, 23:21:18
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n = nums.length;
        int add = 0;
        if (n == 1) {
            return nums[0];
        }
 for (int i = 0; i < n; i++) {
            boolean isGood = true;
            
            if (i - k >= 0 && nums[i] <= nums[i - k]) {
                isGood = false;
            }
            
            if (i + k < n && nums[i] <= nums[i + k]) {
                isGood = false;
            }
            
            if (isGood) {
                add += nums[i];
            }
        }
    
return add;
    } 
}