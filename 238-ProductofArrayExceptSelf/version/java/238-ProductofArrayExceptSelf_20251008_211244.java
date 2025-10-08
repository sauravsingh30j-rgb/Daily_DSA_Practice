// Last updated: 08/10/2025, 21:12:44
class Solution {
    public int[] productExceptSelf(int[] nums) {
       int [] arr = new int[nums.length];
        int [] ans1 = new int[nums.length];
         int [] ans2 = new int[nums.length];
         int n=nums.length;
        ans1[0]=1;
       for(int i=1;i<n;i++)
       { 
            ans1[i]=nums[i-1]*ans1[i-1];
       }
        
        ans2[n-1]=1;
        for(int j=n-2;j>=0;j--)
       {
            ans2[j]=nums[j+1]*ans2[j+1];
       }


       for(int i=0;i<n;i++)
       {
        arr[i]=ans1[i]*ans2[i];
       }
       return arr;
    }
}