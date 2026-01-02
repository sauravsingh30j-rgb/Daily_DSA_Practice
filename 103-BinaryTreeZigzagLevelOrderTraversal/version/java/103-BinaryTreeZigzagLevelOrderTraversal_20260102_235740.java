// Last updated: 02/01/2026, 23:57:40
1
2class Solution {
3    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
4         List<List<Integer>> result = new ArrayList<>();
5        if(root == null) return result;
6        int count=1;
7
8        Queue<TreeNode> q=new LinkedList<>();
9        q.add(root);
10        while(!q.isEmpty()){
11            int size = q.size();
12            List<Integer>list=new ArrayList<>();
13            for(int i=0 ; i<size ; i++){
14                TreeNode curr=q.poll();
15                list.add(curr.val);
16                if(curr.left!=null)q.add(curr.left);
17                if(curr.right!=null)q.add(curr.right);
18
19            }
20            if(count%2==0){
21                Collections.reverse(list);
22                 result.add(list);
23                 count++;
24            }
25           else{
26            result.add(list);
27            count++;
28            }
29        }
30        return result;
31    }
32}