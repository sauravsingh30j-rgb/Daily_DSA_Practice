// Last updated: 13/06/2026, 15:39:24
1class Solution {
2    public int singleNumber(int[] nums) {
3       HashMap<Integer,Integer> map=new HashMap<>();
4       int ans=-1;
5       for(int x:nums)
6       {
7        map.put(x,map.getOrDefault(x,0)+1);
8       }
9        for(int key:map.keySet())
10        {
11           if(map.get(key)==1)
12           {
13            ans=key;
14           }
15        }
16        return ans;
17    }
18}