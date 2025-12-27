// Last updated: 27/12/2025, 21:04:00
1class Solution {
2    public int[][] merge(int[][] intervals) {
3       
4        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
5
6        List<int[]> merged = new ArrayList<>();
7        int[] prev = intervals[0];
8
9        for (int i = 1; i < intervals.length; i++) {
10           
11            if (intervals[i][0] <= prev[1]) {
12                
13                prev[1] = Math.max(prev[1], intervals[i][1]);
14            } else {
15              
16                merged.add(prev);
17                prev = intervals[i];
18            }
19        }
20
21        merged.add(prev); 
22        return merged.toArray(new int[merged.size()][]);
23    }
24}