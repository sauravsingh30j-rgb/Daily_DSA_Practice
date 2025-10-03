// Last updated: 04/10/2025, 01:42:38

class Solution {
    private static int compute(TreeNode node ,int[] maxD ){
        if(node==null) return 0;
        int lh=compute(node.left,maxD);
        int rh=compute(node.right,maxD);

        maxD[0]=Math.max(maxD[0],lh+rh);
        return  1+Math.max(lh,rh);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        int [] maxD= new int [1];
        compute(root,maxD);
        return maxD[0];
    }
}