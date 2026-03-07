// Last updated: 07/03/2026, 22:46:39
1import java.util.*;
2
3class Solution {
4    public double findMaxAverage(int[] nums, int k) {
5        
6        double sum = 0;
7        
8        // First window
9        for(int i = 0; i < k; i++) {
10            sum += nums[i];
11        }
12        
13        double maxSum = sum;
14        
15        // Sliding window
16        for(int i = k; i < nums.length; i++) {
17            sum += nums[i] - nums[i - k];
18            maxSum = Math.max(maxSum, sum);
19        }
20        
21        return maxSum / k;
22    }
23}