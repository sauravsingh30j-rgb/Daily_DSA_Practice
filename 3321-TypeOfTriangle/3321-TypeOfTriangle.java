// Last updated: 27/08/2025, 23:21:29
import java.util.*;
class Solution {
    public String triangleType(int[] nums) {
         Arrays.sort(nums);
         int i=0;
         int a=nums[i];
         int b=nums[i+1];
         int c=nums[i+2];
        if(a+b<=c)
        {
            return "none";
        }
       
        String  ans="isosceles";
       
        if(a==b && a==c)
        {
            ans="equilateral";
        }
        if(a!=b && a!=b && b!=c)
        {
         ans="scalene";
        }
       
      return ans;
        
    }
}