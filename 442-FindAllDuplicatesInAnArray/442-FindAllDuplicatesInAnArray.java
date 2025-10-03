// Last updated: 04/10/2025, 01:42:49
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
         a.add(nums[i]);
            }
        }
        return a;
    }
}