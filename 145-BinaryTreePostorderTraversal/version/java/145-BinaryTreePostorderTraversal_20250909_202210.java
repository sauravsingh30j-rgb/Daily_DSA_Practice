// Last updated: 09/09/2025, 20:22:10
// binary tree post order traversal

class Solution {
    public List<Integer> postorderTraversal(TreeNode node) {
         List<Integer> a= new ArrayList<>();
            post(node,a);
        return a;
    }
    public static void post(TreeNode node, List<Integer> a){
        if(node==null){
                return;
        }
        post(node.left,a);
        post(node.right,a);
         a.add(node.val);
         }
    }
