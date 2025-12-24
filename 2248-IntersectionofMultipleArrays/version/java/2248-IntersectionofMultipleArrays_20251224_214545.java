// Last updated: 24/12/2025, 21:45:45
1
2class Solution {
3    public List<Integer> intersection(int[][] nums) {
4        
5        List<Integer> ans = new ArrayList<>();
6        
7        int[] count  = new int[1001];
8        
9        for(int[] arr : nums){
10            for(int i : arr){
11                count[i]++;
12            }
13        }
14        
15       for(int i=0;i<count.length;i++){
16           if(count[i]==nums.length){
17               ans.add(i);
18           }
19       }
20        
21        return ans;
22    }
23}