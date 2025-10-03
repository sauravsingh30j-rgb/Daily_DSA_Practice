// Last updated: 04/10/2025, 01:43:26
import java.util.ArrayList;

class Solution {
    public void moveZeroes(int[] nums) {
        int c =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0)
            {
                nums[c]=nums[i];
                c++;
            }
        }
        int p=nums.length;
        while(c<nums.length)
        {
            nums[c]=0;
            c++;;
        }
        
        
       
        }
    
}