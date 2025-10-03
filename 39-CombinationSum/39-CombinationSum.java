// Last updated: 04/10/2025, 01:46:12

class Solution {
   

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        cimbination(candidates, target, 0);
        return result;
    }
     List<List<Integer>> result = new ArrayList<>();
    List<Integer> a = new ArrayList<>();

    public void cimbination(int[] candidates, int target, int idx) {
        if (target == 0) {
            result.add(new ArrayList<>(a));
            return;
        }
        if (target < 0 || idx >= candidates.length) {
            return;
        }
        a.add(candidates[idx]);
        cimbination(candidates, target - candidates[idx], idx);
        a.remove(a.size() - 1);
        cimbination(candidates, target, idx + 1);
    }
}
