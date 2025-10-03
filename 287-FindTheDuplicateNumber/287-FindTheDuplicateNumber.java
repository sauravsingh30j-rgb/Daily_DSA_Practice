// Last updated: 04/10/2025, 01:43:23
class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }}return -1;}}