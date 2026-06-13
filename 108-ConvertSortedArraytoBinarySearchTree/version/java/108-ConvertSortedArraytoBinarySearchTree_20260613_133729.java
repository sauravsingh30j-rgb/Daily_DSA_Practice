// Last updated: 13/06/2026, 13:37:29
1
2class Solution {
3    public TreeNode sortedArrayToBST(int[] nums) {
4        return build(nums, 0, nums.length - 1);
5    }
6    private TreeNode build(int[] nums, int left, int right) {
7        if (left > right) {
8            return null;
9        }
10        int mid = (right + left) / 2;
11        TreeNode root = new TreeNode(nums[mid]);
12        root.left = build(nums, left, mid - 1);
13        root.right = build(nums, mid + 1, right);
14        return root;
15    }
16}