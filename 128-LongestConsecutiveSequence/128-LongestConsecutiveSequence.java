// Last updated: 04/10/2025, 01:44:53
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        int maxLen = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                int currLen = 1;
                while (set.contains(currNum + 1)) {
                    currNum++;
                    currLen++;
                }
                maxLen = Math.max(maxLen, currLen);
            }
        }
        return maxLen;
    }
}