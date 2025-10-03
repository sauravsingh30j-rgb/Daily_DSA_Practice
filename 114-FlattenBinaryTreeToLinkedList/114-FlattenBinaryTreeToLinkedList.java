// Last updated: 04/10/2025, 01:45:05
class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        Stack<TreeNode>s= new Stack<TreeNode>();
        s.add(root);

        while(!s.isEmpty()){
            TreeNode temp=s.pop();
            System.out.println(temp.val);
            if(temp.right!=null) s.add(temp.right);
            if(temp.left!=null) s.add(temp.left);

            if(!s.isEmpty()){
                temp.right=s.peek();
            }
            temp.left=null;
             
        }
    }
}