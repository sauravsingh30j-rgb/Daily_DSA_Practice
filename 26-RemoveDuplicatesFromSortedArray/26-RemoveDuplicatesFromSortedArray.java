// Last updated: 04/10/2025, 01:46:26
import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int c = 0;
        int j=0;
        for (int i=0; i<nums.length; i++) {
           
            if (i==0 || nums[i] != nums[i-1] ) {
                nums[j]=nums[i];
                j=j+1;
                c++;
            }
           
        }
        return c; 
    }
}