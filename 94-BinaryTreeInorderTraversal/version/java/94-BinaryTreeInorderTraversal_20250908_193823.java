// Last updated: 08/09/2025, 19:38:23
// binary tree inorder traversal
class Solution {
    public List<Integer> inorderTraversal(TreeNode node) {
       List<Integer> a= new ArrayList<>();
        
            inorder(node,a);
        
        return a;
    }
    public static void inorder(TreeNode node, List<Integer> a){
        if(node==null){
                return;
        }
        inorder(node.left,a);
        a.add(node.val);
        inorder(node.right,a);
    }
}