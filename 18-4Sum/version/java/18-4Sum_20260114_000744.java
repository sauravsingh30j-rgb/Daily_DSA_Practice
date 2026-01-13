// Last updated: 14/01/2026, 00:07:44
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4        int len = nums.length;
5
6        Arrays.sort(nums);
7
8        for (int i = 0; i < len - 3; i++) {
9            if (i > 0 && nums[i - 1] == nums[i]) 
10                continue;
11
12            for (int j = i + 1; j < len - 2; j++) {
13                if (j > i + 1 && nums[j - 1] == nums[j])
14                    continue;
15                
16                int k = j + 1;
17                int l = len - 1;
18
19                while (k < l) {
20                    long sum = nums[i] + nums[j];
21                    sum += nums[k] + nums[l];
22
23                    if (sum == target) {
24                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
25                        k++;
26                        l--;
27
28                        while (k < l && nums[k - 1] == nums[k]) k++;
29                        
30                        while (k < l && nums[l + 1] == nums[l]) l--;
31                    } else if (sum < target)
32                        k++;
33                    else 
34                        l--;
35                }
36            }
37        }
38
39        return ans;
40    }
41}