// Last updated: 04/10/2025, 01:45:15
class Solution {
    public int maxDepth(TreeNode root) {
        if (root ==null) return 0;
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
