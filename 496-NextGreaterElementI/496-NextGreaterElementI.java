// Last updated: 04/10/2025, 01:42:47
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=findnextgreator( nums2,nums1[i]);
        }
        return nums1;
    }
    int findnextgreator(int[] nums,int n)
    { int index=-1;
      for(int i=0;i<nums.length;i++)
        {
           if( nums[i]==n) index=i;
            if(index!=-1 && nums[i]>n) return nums[i];
        }
        return -1;
         
    }
}