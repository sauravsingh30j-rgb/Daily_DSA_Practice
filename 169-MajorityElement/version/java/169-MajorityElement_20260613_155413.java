// Last updated: 13/06/2026, 15:54:13
1class Solution {
2    public int majorityElement(int[] nums) {
3        HashMap<Integer,Integer> a=new HashMap<>();
4        for(int x:nums)
5        {
6            a.put(x,a.getOrDefault(x,0)+1);
7        }
8        int ans=0;
9        int max=-1;
10        for(int key:a.keySet())
11        {
12            if(a.get(key)>max)
13            {
14                max=a.get(key);
15                ans=key;
16            }
17        }
18        return ans;
19    }
20}