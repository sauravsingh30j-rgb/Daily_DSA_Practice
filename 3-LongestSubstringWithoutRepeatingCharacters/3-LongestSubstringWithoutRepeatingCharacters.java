// Last updated: 04/10/2025, 01:46:56
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] str = s.toCharArray();
        int n = str.length;
        int start = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(str[i]) && start <= map.get(str[i])) {
                start = map.get(str[i]) + 1;
            }
            map.put(str[i], i);
            max = Math.max(max, i - start + 1);
        }

        return max;
    }
}