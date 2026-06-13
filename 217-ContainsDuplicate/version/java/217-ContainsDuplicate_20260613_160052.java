// Last updated: 13/06/2026, 16:00:52
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3       // Arrays.sort(nums);
4        HashMap<Integer,Integer> a=new HashMap<>();
5        for(int x:nums)
6        {
7            a.put(x,a.getOrDefault(x,0)+1);
8        }
9        for(int key:a.keySet())
10        {
11            if(a.get(key)>1)
12            {
13                return true;
14            }
15        }
16        return false;
17    }
18}