// Last updated: 04/10/2025, 01:44:35

class Solution {
    public List<Integer> preorderTraversal(TreeNode node) {
         List<Integer> a= new ArrayList<>();
            PRE(node,a);
        return a;
    }
    public static void PRE(TreeNode node, List<Integer> a){
        if(node==null){
                return;
        }
        a.add(node.val);
        PRE(node.left,a);
        PRE(node.right,a);}
    
}