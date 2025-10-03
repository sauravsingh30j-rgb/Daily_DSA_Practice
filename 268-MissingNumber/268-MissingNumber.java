// Last updated: 04/10/2025, 01:43:38
class Solution {
    public int missingNumber(int[] nums) {
        int[] f=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            f[nums[i]]++;
        }
        for(int i=0;i<f.length;i++){
           if(f[i]==0){
            return i;
           }
        }
return -1;
    }
}