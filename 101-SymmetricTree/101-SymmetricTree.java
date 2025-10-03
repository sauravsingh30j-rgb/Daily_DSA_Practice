// Last updated: 04/10/2025, 01:45:19
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || helper(root.left, root.right);
    }

    private boolean helper(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        return left.val == right.val && helper(left.left, right.right) && helper(left.right, right.left);
    }
}