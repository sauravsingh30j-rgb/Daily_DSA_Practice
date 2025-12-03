// Last updated: 03/12/2025, 23:53:15
// max gaap
1class Solution {
2    public int maximumGap(int[] nums) {
3        int n=nums.length;
4        if(n<2){
5            return 0;
6        }
7        Arrays.sort(nums);
8        int mgap=0;
9        for(int i=0;i<n-1;i++){
10            int gap=nums[i+1]-nums[i];
11            if(mgap<gap){
12                mgap=gap;
13            }
14        }
15        return mgap;
16    }
17}