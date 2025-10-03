// Last updated: 04/10/2025, 01:42:09
import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
       int l=nums.length;
       int arr[]=new int[l];
        for(int i=0;i<=nums.length-1;i++)
        {
            arr[i]=(nums[i]*nums[i]);
        }
        Arrays.sort(arr);
       return (arr);
    }

}