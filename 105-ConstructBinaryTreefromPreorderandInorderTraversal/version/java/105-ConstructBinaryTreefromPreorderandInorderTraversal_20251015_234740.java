// Last updated: 15/10/2025, 23:47:40

class Solution {
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, inorder.length - 1);
    }
    private TreeNode buildTree(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) return null;
        TreeNode root = new TreeNode(preorder[preIndex++]);
        int index = start;
        while (inorder[index] != root.val) index++;
        root.left = buildTree(preorder, inorder, start, index - 1);
        root.right = buildTree(preorder, inorder, index + 1, end);
        return root;}}