// Last updated: 27/08/2025, 23:21:21
class Solution {
    public int countSubarrays(int[] nums) {
        int p=nums.length;
        int count=0;
        int res;
        for(int i=1;i<p-1;i++)
            {
                if(2*(nums[i-1]+nums[i+1])==nums[i])
                    count++;
            }
        if(count>=1)
        {
            res=count;
        }
        else {
            res=0;
        }
    return res;
    }
}