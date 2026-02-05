// Last updated: 06/02/2026, 01:48:18
class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean validate(TreeNode node, long min, long max) {
        // Empty tree is valid
        if (node == null) return true;
        
        // Current node must be in valid range
        if (node.val <= min || node.val >= max) return false;
        
        // Recursively validate subtrees with tightened bounds
        return validate(node.left, min, node.val) && 
               validate(node.right, node.val, max);
    }
}
