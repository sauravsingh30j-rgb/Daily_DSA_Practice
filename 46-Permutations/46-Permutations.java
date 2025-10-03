// Last updated: 04/10/2025, 01:46:04
class Solution {
    void nextPermutation(int arr[],List<Integer>temp,List<List<Integer>> nums,int start){
        if(temp.size()==arr.length){
            nums.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            if(temp.contains(arr[i]))continue;
            temp.add(arr[i]);
            nextPermutation(arr,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        nextPermutation(nums,new ArrayList<>(),res,0);
        return res;
    }
}