// Last updated: 27/08/2025, 23:21:24
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> a= new ArrayList<>();
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                a.add(nums[i]);
                i=i+1;
            }
        }
       int arr[]=new int[2];
       arr[0]=a.get(0);
       arr[1]=a.get(1);
       return arr;
    }
}