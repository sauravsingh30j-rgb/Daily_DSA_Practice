// Last updated: 13/06/2026, 13:11:31
1class Solution {
2    public TreeNode sortedArrayToBST(int[] nums) {
3        return build(nums, 0, nums.length - 1);
4    }
5    private TreeNode build(int[] nums, int left, int right) {
6        if (left > right) {
7            return null;
8        }
9        int mid = (left + right ) / 2;
10        TreeNode root = new TreeNode(nums[mid]);
11        root.left = build(nums, left, mid - 1);
12        root.right = build(nums, mid + 1, right);
13        return root;
14    }
15}