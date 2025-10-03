// Last updated: 04/10/2025, 01:46:24
public class Solution {
    public static int removeElement(int[] nums, int val) {
       
        int c = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[c] = nums[i];
                c++;
            }
        
        }
    
        return c;
    }
}