// Last updated: 01/03/2026, 22:07:04
1class Solution {
2    public TreeNode buildTree(int[] inorder, int[] postorder) {
3        return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
4    }
5    
6    public TreeNode build(int[] inorder, int inS, int inE, int[] postorder, int posS, int posE){
7        if(inS>inE || posS>posE) return  null;
8        
9        TreeNode root = new TreeNode(postorder[posE]);
10        
11        int rootI=0;
12        for(int i=0;i<inorder.length;i++){
13            if(inorder[i]==root.val){
14                rootI = i;
15                break;
16            }
17        }
18        
19        root.left = build(inorder,inS,rootI-1,postorder,posS,posS+rootI-inS-1);
20        root.right = build(inorder,rootI+1,inE,postorder,posS+rootI-inS,posE-1);
21        
22        return root;
23    }
24}