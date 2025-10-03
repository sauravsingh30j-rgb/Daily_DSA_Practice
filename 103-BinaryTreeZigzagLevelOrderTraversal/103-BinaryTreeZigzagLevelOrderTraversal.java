// Last updated: 04/10/2025, 01:45:16

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        int count=1;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer>list=new ArrayList<>();
            for(int i=0 ; i<size ; i++){
                TreeNode curr=q.poll();
                list.add(curr.val);
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);

            }
            if(count%2==0){
                Collections.reverse(list);
                 result.add(list);
                 count++;
            }
           else{
            result.add(list);
            count++;
            }
        }
        return result;
    }
}