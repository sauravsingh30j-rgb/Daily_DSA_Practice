// Last updated: 30/01/2026, 00:31:10
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3
4        // List to store the final merged intervals
5        List<int[]> result = new ArrayList<>();
6
7        // Traverse each interval
8        for (int[] interval : intervals) {
9
10            // Case 1: Current interval ends before newInterval starts
11            if (interval[1] < newInterval[0]) {
12                // Safe to add since no overlap
13                result.add(interval);
14            }
15
16            // Case 2: Current interval starts after newInterval ends
17            else if (interval[0] > newInterval[1]) {
18                // Add the merged newInterval to result
19                result.add(newInterval);
20
21                // Update newInterval to current interval
22                newInterval = interval;
23            }
24
25            // Case 3: Overlapping intervals
26            else {
27                // Merge by taking minimum start
28                newInterval[0] = Math.min(newInterval[0], interval[0]);
29
30                // Merge by taking maximum end
31                newInterval[1] = Math.max(newInterval[1], interval[1]);
32            }
33        }
34
35        // Add the last interval
36        result.add(newInterval);
37
38        // Convert list to array and return
39        return result.toArray(new int[result.size()][]);
40    }
41}