// Last updated: 12/06/2026, 20:28:41
1class Solution {
2    public int removeDuplicates(int[] nums) {
3
4        ArrayList<Integer> a = new ArrayList<>();
5
6        for (int i = 1; i < nums.length; i++) {
7            if (nums[i] != nums[i - 1]) {
8                a.add(nums[i - 1]);
9            }
10        }
11
12        if (a.size() == 0 || a.get(a.size() - 1) != nums[nums.length - 1]) {
13            a.add(nums[nums.length - 1]);
14        }
15
16        int p = 0;
17        for (int num : a) {
18            nums[p] = num;
19            p++;
20        }
21
22        return a.size();
23    }
24}