// Last updated: 04/10/2025, 01:44:15
class Solution {
    public void rotate(int[] nums, int k) {
       int n=nums.length;
        k=k%n;
      rev(nums,0,n-1);
      rev(nums,0,k-1);
      rev(nums,k,n-1);
       
    }
    void rev(int[]nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}