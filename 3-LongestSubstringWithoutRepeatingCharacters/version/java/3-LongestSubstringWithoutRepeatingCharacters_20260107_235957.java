// Last updated: 07/01/2026, 23:59:57
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashMap<Character, Integer> map = new HashMap<>();
4        char[] str = s.toCharArray();
5        int n = str.length;
6        int start = 0;
7        int max = 0;
8
9        for (int i = 0; i < n; i++) {
10            if (map.containsKey(str[i]) && start <= map.get(str[i])) {
11                start = map.get(str[i]) + 1;
12            }
13            map.put(str[i], i);
14            max = Math.max(max, i - start + 1);
15        }
16
17        return max;
18    }
19}