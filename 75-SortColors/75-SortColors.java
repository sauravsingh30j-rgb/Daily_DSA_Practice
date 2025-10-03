// Last updated: 04/10/2025, 01:45:39
import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        int count=0;
        int a=0,b=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0){
                a++;
            }
            if(nums[i]==1){
                b++;
            }
           
        }
        c=nums.length-a-b;
        b=b+a;
        for(int i=0;i<nums.length;i++)
        {
            if(i<a)
            {
                nums[i]=0;
            }
            else if(i<b)
            {
                nums[i]=1;
            }
            else
            {
                nums[i]=2;
            }
        }
       
    }
}