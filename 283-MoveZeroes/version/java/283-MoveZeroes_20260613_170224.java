// Last updated: 13/06/2026, 17:02:24
1class Solution {
2    public void moveZeroes(int[] nums) {
3       // Arrays.sort(nums);
4        int k=0;
5        int c=0;
6        int []nums1=new int[nums.length];
7        for(int i=0;i<nums.length;i++)
8        {
9            if(nums[i]!=0)
10            {
11                int temp=nums[i];
12                nums[k]=temp;
13                k++; 
14            }
15            else
16            {
17                c++;
18            }
19        }
20        int i=0;
21        while( i<c){
22            nums[k]=0;k++;i++;
23        }
24
25        }
26    
27}